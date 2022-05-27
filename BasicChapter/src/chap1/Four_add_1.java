package chap1;

public class Four_add_1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a + b;
		int d = a - b;
		int e = a * b;
		float f =  (float) a / (float) b; //캐스팅 = 강제타입변환
		int g = a % b;
		char a_korea = 'K';
		String name = "유명선";
		
		System.out.println("a와 b의 합계는 "+c+"입니다.");
		System.out.println("a와 b의 차이는 "+d+"입니다.");
		System.out.println("a와 b의 곱셈은 "+e+"입니다.");
		System.out.println("a와 b의 나눗셈은 "+f+"입니다.");
		System.out.println("a와 b의 나눈 나머지는 "+g+"입니다.");
		System.out.println("한 문자의 출력은 "+ a_korea+"입니다.");
		System.out.println("나의 이름은 "+name+"입니다.");
		
		char charValue = 'A';
		int intValue = charValue;
		System.out.println(charValue);
		System.out.println(intValue);
		
//		byte byteValue = 65;
//		char charValue = (char) byteValue;
//		System.out.println(byteValue);
//		System.out.println(charValue_1);
		
		int intValue_1 = 10;
		byte byteValue = (byte) intValue_1;
		System.out.println(intValue_1);
		System.out.println(byteValue);
		
		int intValue_2 = 65;
		char charValue_2 = (char) intValue_2;
		System.out.println(intValue_2);
		System.out.println(charValue_2);
		
		double doubleValue = 3.41;
		int intValue_3 = (int)doubleValue;
		System.out.println(intValue_3);
		
		byte x = 10;
		byte y = 20;
	    int result = x + y;

	    double result_1 = 1.5 + 2.3;
//	    float result_2 = 1.5 + 2.3; f를 붙이지 않으면 오류남
	    float result_3 = 1.5f + 2.3f;
	    
	    String str = "3" + 7;
	    String str_2 = 3 + "7";
	    System.out.println(str);
	    System.out.println(str_2);
	    
	    String str_3 = "1" + 2 + 3;
	    System.out.println(str_3);
	}

}
