package chap3;

public class Singleton {
	private static Singleton instance;
	public static Singleton getlnstance() {
		if (instance == null) {
			System.out.println("create instance");
			instance = new Singleton();
		}
		return instance;
	}
}
