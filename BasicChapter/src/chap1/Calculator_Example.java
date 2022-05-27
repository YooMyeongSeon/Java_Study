package chap1;

public class Calculator_Example {

	public static void main(String[] args) {
		double result = 10 * 10 * Calculator.pi;
		int result_2 = Calculator.plus(10, 5);
		int result_3 = Calculator.minus(10, 5);
		System.out.println("result = "+result);
		System.out.println("result_2 = "+result_2);
		System.out.println("result_3 = "+result_3);
	}

}
