package chap3;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getlnstance();
		Singleton instance2 = Singleton.getlnstance();
		System.out.println("instance1/instance2 : "+(instance1 == instance2));
	}

}
