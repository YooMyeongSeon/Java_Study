package chap3;

class A {
	void hello() {
		System.out.println("A say hello");
	}
}
class B extends A {
	void hello() {
		System.out.println("B say hello");
		System.out.println("hahahahaha");
	}
}

public class C {

	public static void main(String[] args) {
		A a = new A();
		a.hello();
		
		B b = new B();
		b.hello();
	}
}
