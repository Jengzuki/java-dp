package iterator;

public class HanbitEni implements HanbitEniService{
	private Student[] students;
	private int Student;
	private int last;
	
	
	public HanbitEni(int foo) {
		this.students = new Student[foo];
		if (foo >= 0) {
			System.out.println("등록되었습니다.");
		}else {
			System.out.println("정원이 찼습니다.");
		}
	}
	public void add(Student student) {
		this.students[last] = student;
		last++;
		}
	
	public Student[] getStudents() {
		return students;
	}
	public int getStudent() {
		return Student;
	}
	
	public void setStudent(int student) {
		Student = student;
	}
	public Student getStudent(int index){
		return students[index];
	}
	public int getCount() {
		
		return last;
	}
	
	@Override
	public MyIterator iterator() {
		return new HanbitIterator(this);
	}

}
