package chap1;

public class Operation2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = num1 == num2; //���� true�� �ȴ�.
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
			System.out.println("�빮���Դϴ�!");
		}
		if ((charCode>=97) & (charCode<=122)) { //a=97, z=122
			System.out.println("�ҹ����Դϴ�!");
		}
		if ((charCode<48) & (charCode>57)) {
			System.out.println("0���� 9������ �����Դϴ�!");
		}
		int value = 6;
		if ((value%2==0) | (value%3==0)) {
			System.out.println("2 �Ǵ� 3�� ����Դϴ�!");
		}
		int value1 = 45;
		if ((value1%3==0) & (value1%5==0)) {
			System.out.println("3 �Ǵ� 5�� ������Դϴ�!");
		}
		else {
			System.out.println("3 �Ǵ� 5�� ������� �ƴմϴ�!");
		}
		int result6 = 1;
		result6 += 10; //���Կ�����
		result6 -= 10; //1
		result6 *= 10; //10
		result6 /= 10; //1
		result6 %= 10; //1
		System.out.println(result6);
	}

}
