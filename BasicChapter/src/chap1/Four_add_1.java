package chap1;

public class Four_add_1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a + b;
		int d = a - b;
		int e = a * b;
		float f =  (float) a / (float) b; //ĳ���� = ����Ÿ�Ժ�ȯ
		int g = a % b;
		char a_korea = 'K';
		String name = "����";
		
		System.out.println("a�� b�� �հ�� "+c+"�Դϴ�.");
		System.out.println("a�� b�� ���̴� "+d+"�Դϴ�.");
		System.out.println("a�� b�� ������ "+e+"�Դϴ�.");
		System.out.println("a�� b�� �������� "+f+"�Դϴ�.");
		System.out.println("a�� b�� ���� �������� "+g+"�Դϴ�.");
		System.out.println("�� ������ ����� "+ a_korea+"�Դϴ�.");
		System.out.println("���� �̸��� "+name+"�Դϴ�.");
		
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
//	    float result_2 = 1.5 + 2.3; f�� ������ ������ ������
	    float result_3 = 1.5f + 2.3f;
	    
	    String str = "3" + 7;
	    String str_2 = 3 + "7";
	    System.out.println(str);
	    System.out.println(str_2);
	    
	    String str_3 = "1" + 2 + 3;
	    System.out.println(str_3);
	}

}
