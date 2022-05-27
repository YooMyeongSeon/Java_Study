package chap4;

public abstract class Phone { //추상클래스
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("핸드폰의 전원이 켜졌습니다.");
	}
	
	public void turnOff() {
		System.out.println("핸드폰의 전원이 꺼졌습니다.");
	}
}
