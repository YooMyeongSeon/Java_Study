package chap1;

public class Operation2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = num1 == num2; //값은 true가 된다.
		boolean result2 = num1 != num2;
		boolean result3 = num1 <= num2;
		boolean result4 = num1 > num2;
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
		System.out.println("result4 : "+result4);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result5 = char1 < char2;
		System.out.println("result5 : "+result5);
		
		int charCode = 'A';
		if ((charCode>=65) & (charCode<=90)) { //A=65, Z=90
			System.out.println("대문자입니다!");
		}
		if ((charCode>=97) & (charCode<=122)) { //a=97, z=122
			System.out.println("소문자입니다!");
		}
		if ((charCode<48) & (charCode>57)) {
			System.out.println("0부터 9까지의 숫자입니다!");
		}
		int value = 6;
		if ((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수입니다!");
		}
		int value1 = 45;
		if ((value1%3==0) & (value1%5==0)) {
			System.out.println("3 또는 5의 공배수입니다!");
		}
		else {
			System.out.println("3 또는 5의 공배수가 아닙니다!");
		}
		int result6 = 1;
		result6 += 10; //대입연산자
		result6 -= 10; //1
		result6 *= 10; //10
		result6 /= 10; //1
		result6 %= 10; //1
		System.out.println(result6);
	}

}
