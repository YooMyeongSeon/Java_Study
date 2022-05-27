package chap1;

import java.util.TreeSet;

public class Ex05TreeSet {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>(); //트리셋의 타입을 문자열로 선언함
		
		names.add("고길동");
		names.add("김길동");
		names.add("이길동");
		names.add("박길동");
		names.add("홍길동");
		names.add("유길동");
		names.add("최길동");
		
		System.out.println("첫번째 순서 이름 : " + names.first()); //한글은 가나다순으로 정렬
		System.out.println("마지막 순서 이름 : " + names.last());
		System.out.println("유길동 전 순서 이름 : " + names.lower("유길동"));
		System.out.println("유길동 다음 순서 이름 : " + names.higher("유길동"));
		System.out.println("유길동보다 작거나 같은 이름 : " + names.floor("유길동")); //유길동이 있기 때문에 유길동이 나온다.
		System.out.println("배길동보다 작거나 같은 이름 : " + names.floor("배길동")); //배길동이 없기 때문에 전 순서인 박길동이 나온다.
		System.out.println("유길동보다 크거나 같은 이름 : " + names.ceiling("유길동")); //유길동이 있기 때문에 유길동이 나온다.
		System.out.println("배길동보다 크거나 같은 이름 : " + names.ceiling("배길동")); //배길동이 없기 때문에 다음 순서인 유길동이 나온다.
	}

}
