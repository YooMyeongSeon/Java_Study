package chap1;

public class Operation1 {

	public static void main(String[] args) {
		int a = -100;
		int result_1 = +a;
		int result_2 = -a;
		
		byte b = 100;
//		byte result_3 = -b; //컴파일 에러, 부호연산의 결과가 int이기 때문

		int result_3 = -b;
		
		System.out.println("result_1 : "+result_1);
		System.out.println("result_2 : "+result_2);
		
		// 증감연산자 ++ --
		int x = 1;
		int y = 1;
		
		// x++; x=x+1; ++x; x+=1; 모두 같지만 단독으로만 존재할 때 가능하다.
		
		int result1 = ++x + 10; //앞자리에 위치하는 연산자를 전치 연산자라 한다.
		int result2 = y++ + 10; //뒷자리에 위치하는 연산자를 후치 연산자라 한다. 단독으로 있지 않기 때문에 

		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		int a1 = 10;
		int b1 = 10;
		int c1;
		
		System.out.println("------------------------------");
		a1++;
		++a1; //++, --증감 연산자가 단독으로 나왔을 때 에는 전치, 후치 연산을 따지지 않는다.
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
	
		System.out.println("------------------------------");//어려운 문제
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
