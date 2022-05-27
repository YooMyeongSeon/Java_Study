package chap1;

import java.util.ArrayList;

public class Ex01Alist { //배열에 대한 복습

	public static void main(String[] args) {
		int[] ArrNumbers = new int[5]; //5칸 배열을 숫자 타입으로 준비하다.
		ArrNumbers[0] = 0; //ArrNumbers 인덱스 0에 0 데이터를 넣다.
		String[] ArrNames = new String[5]; //5칸 배열을 문자열 타입으으로 준비하다.
		ArrNames[0] = "고길동"; //ArrNames 인덱스 0에 고길동 데이터를 넣다.
		ArrNames[1] = "김길동";
		ArrNames[2] = "이길동";
		ArrNames[3] = "박길동";
		ArrNames[4] = "홍길동";
		
		System.out.println("0번의 이름 : "+ArrNames[0]);
		
		ArrayList<String> names = new ArrayList<String>();
		//배열과 비슷하지만 갯수를 적지 않고, 제네릭 타입(<>안의 타입)은 무조건 참조 타입만 가능하다.
		//기본 타입을 참조 타입으로 포장한다.(Wrapper 클래스라 한다.)
		
		//byte : Byte
		//short : Short
		//int : Integer
		//long : Long 
		//float : Float
		//double : Double
		//char : Character
		//boolean : Boolean
		
		names.add("고길동"); //names라는 ArrayList에 추가한다.
		System.out.println("0번의 이름 : "+names.get(0));
		names.add("김길동");
		System.out.println("1번의 이름 : "+names.get(1));
		names.add("이길동");
		names.add("박길동");
		names.add("홍길동"); //인덱스 4
		System.out.println("------------------------------");
		for (int i=0; i<names.size(); i++) { //for문을 통해 리스트 모두 꺼내기
			System.out.println((i)+"번째 사람 : "+names.get(i));
		}
		
		names.add(2, "조길동"); //2번 인덱스에 끼워넣고, 기존 2번은 3번으로 밀려다난다.
		
		System.out.println("------------------------------");
		for (int i=0; i<names.size(); i++) {
			System.out.println((i)+"번째 사람 : "+names.get(i));
		}
		
		names.set(2, "문길동"); //2번 인덱스 값을 바꾼다.
		
		System.out.println("------------------------------");
		for (int i=0; i<names.size(); i++) {
			System.out.println((i)+"번째 사람 : "+names.get(i));
		}
		
		names.remove(2); //2번 인덱스를 삭제한다.
		
		System.out.println("------------------------------");
		for (int i=0; i<names.size(); i++) {
			System.out.println((i)+"번째 사람 : "+names.get(i));
		}
		
		for (String name:names) { //반복자를 구현하므로, 향상된 for문을 사용할 수 있다.
			System.out.println("반복자로 출력한 이름 : "+name);
		}
		
		names.clear(); //리스트를 모두 삭제한다.
		
		System.out.println(names);
		
		//ArrayList의 장단점 : 검색이 빠르지만, 입출력시 속도 저하가 있다.
	}
}
