package chap1;

public class Operation1 {

	public static void main(String[] args) {
		int a = -100;
		int result_1 = +a;
		int result_2 = -a;
		
		byte b = 100;
//		byte result_3 = -b; //������ ����, ��ȣ������ ����� int�̱� ����

		int result_3 = -b;
		
		System.out.println("result_1 : "+result_1);
		System.out.println("result_2 : "+result_2);
		
		// ���������� ++ --
		int x = 1;
		int y = 1;
		
		// x++; x=x+1; ++x; x+=1; ��� ������ �ܵ����θ� ������ �� �����ϴ�.
		
		int result1 = ++x + 10; //���ڸ��� ��ġ�ϴ� �����ڸ� ��ġ �����ڶ� �Ѵ�.
		int result2 = y++ + 10; //���ڸ��� ��ġ�ϴ� �����ڸ� ��ġ �����ڶ� �Ѵ�. �ܵ����� ���� �ʱ� ������ 

		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		int a1 = 10;
		int b1 = 10;
		int c1;
		
		System.out.println("------------------------------");
		a1++;
		++a1; //++, --���� �����ڰ� �ܵ����� ������ �� ���� ��ġ, ��ġ ������ ������ �ʴ´�.
		System.out.println("a = " + a1);
		
		System.out.println("------------------------------");
		b1--;
		--b1;
		System.out.println("b = " + b1);
		
		System.out.println("------------------------------");
		c1 = a1++;
		System.out.println("c = " + c1);
		System.out.println("a = " + a1);
		
		System.out.println("------------------------------");
		c1 = ++a1 + --b1 + a1++ + b1--;
		System.out.println("a = " + a1);
		System.out.println("b = " + b1);
		System.out.println("c = " + c1);
	
		System.out.println("------------------------------");//����� ����
		c1 += a1-- - b1++ + ++a1 - --b1;
		System.out.println("a = " + a1); 
		System.out.println("b = " + b1);
		System.out.println("c = " + c1);
		
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
	}
}
