package chap1;

public class Calculator {
	static double pi = 3.14159; // static = 정적멤버 : 공통필드
								// 인스턴스 필드 : 객체마다 고유한 값을 새롭게 부여
	static int plus(int x, int y) {
		return x + y;
	}
	static int minus(int x, int y) {
		return x - y;
	}
}
