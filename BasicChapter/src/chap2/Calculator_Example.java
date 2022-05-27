package chap2;

public class Calculator_Example {

	public static void main(String[] args) {
		Calculator mycalc = new Calculator();
		
		mycalc.poweOn();
		
		int result1 = mycalc.plus(5, 6);
		System.out.println(result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = mycalc.divide(x, y);
		System.out.println(result2);
		
		mycalc.poweOff();
	}
}