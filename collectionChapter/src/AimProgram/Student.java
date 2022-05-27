package AimProgram;

public class Student extends Member{
	String major;
	
	public Student(String name, String id, String pw, String major) {
		super(name, id, pw);
		this.major = major;
	}
	
	@Override
	public void work() {
		System.out.println("공부를 합니다.");
	}

	@Override
	public void test() {
		System.out.println("시험을 봅니다.");
	}
}
