package AimProgram;

public class Teacher extends Member{
	String subject;
	
	public Teacher(String name, String id, String pw, String subject) {
		super(name, id, pw);
		this.subject = subject;
	}
	
	@Override
	public void work() {
		System.out.println("강의를 합니다.");
	}

	@Override
	public void test() {
		System.out.println("채점를 합니다.");
	}

}