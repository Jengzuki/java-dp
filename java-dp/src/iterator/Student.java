package iterator;

public class Student {
	private String name; //학생이름
	private String subject; //배우는 과목
	
	
	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public Student(String subject , String name) {
		this.subject = subject;
		this.name = name;
}
	}
