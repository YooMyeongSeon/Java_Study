package chap3;

public class Singleton_1 {
	
	private static Singleton_1 sington = new Singleton_1();

	static Singleton_1 getInstance() {
		return sington;
	}
}
