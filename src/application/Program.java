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
			System.out.println("Dados da " + i + "ª aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Título: ");
			String title = sc.nextLine();
			
			if (type == 'c') {
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				System.out.print("Duração em segundos: ");
				int seconds = sc.nextInt();
				sc.nextLine();
				lessons.add(new Video(title, url, seconds));
			} else {
				System.out.print("Descrição: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int quantity = sc.nextInt();
				sc.nextLine();
				lessons.add(new Task(title, description, quantity));
			}
			System.out.println();
		}
		for (Lesson lesson : lessons) {
			totalSeconds += lesson.duration();	
		}
		System.out.printf("DURAÇÃO TOTAL DO CURSO = %d segundos", totalSeconds);
		
		sc.close();
	}
}
