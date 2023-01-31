package entities;

public class Task extends Lesson{

	private String description;
	private int questionCount;
	
	public Task() {
	}
	
	public Task(String title, String description, int questionCount) {
		super(title);
		this.description = description;
		this.questionCount = questionCount;
	}

	@Override
	public int duration() {
		return questionCount * 5 * 60;
	}
}
