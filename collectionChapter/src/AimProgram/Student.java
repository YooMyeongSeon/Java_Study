package AimProgram;

public class Student extends Member{
	String major;
	
	public Student(String name, String id, String pw, String major) {
		super(name, id, pw);
		this.major = major;
	}
	
	@Override
	public void work() {
		System.out.println("���θ� �մϴ�.");
	}

	@Override
	public void test() {
		System.out.println("������ ���ϴ�.");
	}
}
