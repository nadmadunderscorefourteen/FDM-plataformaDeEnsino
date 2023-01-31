package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Lesson> lessons = new ArrayList<>();
		int totalSeconds = 0;

		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados da " + i + "� aula:");
			System.out.print("Conte�do ou tarefa (c/t)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("T�tulo: ");
			String title = sc.nextLine();
			
			if (type == 'c') {
				System.out.print("URL do v�deo: ");
				String url = sc.nextLine();
				System.out.print("Dura��o em segundos: ");
				int seconds = sc.nextInt();
				sc.nextLine();
				lessons.add(new Video(title, url, seconds));
			} else {
				System.out.print("Descri��o: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de quest�es: ");
				int quantity = sc.nextInt();
				sc.nextLine();
				lessons.add(new Task(title, description, quantity));
			}
			System.out.println();
		}
		for (Lesson lesson : lessons) {
			totalSeconds += lesson.duration();	
		}
		System.out.printf("DURA��O TOTAL DO CURSO = %d segundos", totalSeconds);
		
		sc.close();
	}
}
