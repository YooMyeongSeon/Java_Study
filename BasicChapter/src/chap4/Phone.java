package chap4;

public abstract class Phone { //�߻�Ŭ����
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("�ڵ����� ������ �������ϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�ڵ����� ������ �������ϴ�.");
	}
}
