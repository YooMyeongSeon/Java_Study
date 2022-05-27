package chap1;

public class Swapping {

	public static void main(String[] args) {
		int x = 30;
		int y = 50;
		System.out.println("x: "+x+", y: "+y);
		System.out.println("x와 y값을 교환합니다. 스와핑됩니다.\n");
		
		int temp1; ;//임시변수 선언
		temp1 = x; //스와핑 구현
		x = y;
		y = temp1;
				
		System.out.println("x: "+x+", y: "+y);
		
		//i:본인이름 you:홍길동
		//나:유명선, 너:홍길동
		//나와 너의 이름을 스와핑 하겠습니다.
		//나는 홍길동이고, 너는 유명선이다.
		//나와 너의 이름이 스와핑 되었습니다.
		
		String i = "유명선";
		String you = "홍길동";
		System.out.println("나의 이름은 "+i+"이고, 너의 이름은 "+you+"이다.\n나와 너의 이름을 스와핑 한다.");
		String swapping = i;
		i=you;
		you=swapping;
		System.out.println("나의 이름은 "+i+"이고, 너의 이름은 "+you+"이다.\n나와 너의 이름은 스와핑 되었다.");
	}

}
