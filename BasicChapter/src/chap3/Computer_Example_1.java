package chap3;

class Calculator_1 {
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle 실행");
		return 3.14 * r * r;
	}
}

class Computer_1 extends Calculator_1{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI * r * r;
	}
}

public class Computer_Example_1 {

	public static void main(String[] args) {
		int r = 10;
		Calculator_1 calculator = new Calculator_1();
		System.out.println("원의 면적 : " + calculator.areaCircle(r));
		
		Computer_1 computer = new Computer_1();
		System.out.println("원의 면적 : " + computer.areaCircle(r));
	}
}
