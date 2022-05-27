package chap3;

public class Singleton_1_Example {

	public static void main(String[] args) {
//		Singleton_1 obj1 = new Singleton_1(); ƒƒ∆ƒ¿œ ø°∑Ø
//		Singleton_1 obj2 = new Singleton_1();
		
		Singleton_1 obj1 = Singleton_1.getInstance();
		Singleton_1 obj2 = Singleton_1.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("∞∞¿∫ ΩÃ±€≈Ê ∞¥√º¿‘¥œ¥Ÿ.");
		} else {
			System.out.println("¥Ÿ∏• ΩÃ±€≈Ê ∞¥√º¿‘¥œ¥Ÿ.");
		}
	}

}
