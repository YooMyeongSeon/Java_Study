package AimProgram;

public abstract class Member implements Task{
	String name;
	String id;
	String pw;

	public Member(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}

	@Override
	public void work() {
	}

	@Override
	public void test() {
	}
}
