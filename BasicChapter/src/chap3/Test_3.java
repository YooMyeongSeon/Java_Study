package chap3;

abstract class Animal { //�߻�Ŭ����
	String a = "is animal";
	abstract void look();
	void show() {
		System.out.println("Zoo");
	}
}
class Chicken extends Animal {
	Chicken() {
		look();
	}
	void look() {
		System.out.println("Chicken " + a);
	}
	void display( ) {
		System.out.println("two wings");
	}
}

public class Test_3 {

	public static void main(String[] args) {
		Animal a = new Chicken(); //����ȯ
		a.show();
	}
}