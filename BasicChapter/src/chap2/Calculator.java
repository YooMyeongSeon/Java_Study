package chap2;

public class Calculator {
	void poweOn() {
		System.out.println("전원이 켜집니다.");
	}
	void poweOff() {
		System.out.println("전원이 꺼집니다.");
	}
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
}
