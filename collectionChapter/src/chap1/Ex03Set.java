package chap1;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03Set { //Set에 대한 이해

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		
		names.add("고길동"); //names 셋에 추가
		names.add("김길동");
		names.add("고길동");
		names.add("이길동");
		names.add("고길동");
		names.add("박길동");
		
		System.out.println("전체 갯수 : "+names.size()); //중복된 고길동은 삭제하고 4를 표시
		
		//Set에서 전체 데이터 조회하기(Set에서 데이터를 꺼내와 일렬로 세운다.)
		Iterator<String> itr = names.iterator();
		
		//다음 데이터 있는지 체크 후, 하나씩 출력
		while (itr.hasNext()) { //itr이 다음것을 가지고 있느냐가 조건
			String name = itr.next();
			System.out.println("이름 : "+name);
		}
		//[주의]반복자는 1회용이고 Set의 데이터는 여전히 남아있다.
		
		//1. 반복자(iterator, iterable 인터페이스를 구현) : 향상된 for문(foreach문)이 가능하다.
		
		String[] tests = new String[100];
		
		for (int i=0; i<tests.length; i++) {
			//for문 내용
		}
		
		System.out.println("------------------------------");
		for (String str:tests) { //향상된 for문
			System.out.println("이름 : "+str);
		}
		
		System.out.println("------------------------------");
		for (String name:names) { //Set은 반복자를 구현하므로, 향상된 for문을 사용할 수 있다.
			System.out.println("이름 : "+name);
		}
		
		//2. 무엇이 중복인가
		System.out.println("------------------------------");
		
		HashSet<Student> studentSet = new HashSet<Student>();
		
		studentSet.add(new Student(1, "고길동", 55)); //학생들을 목록에 추가
		studentSet.add(new Student(2, "김길동", 56));
		studentSet.add(new Student(3, "이길동", 57));
		studentSet.add(new Student(4, "김길동", 52));
		studentSet.add(new Student(2, "박길동", 55)); //김길동과 박길동의 숫자가 같다.(원래 총 5명)
		
		System.out.println("인원수 : "+studentSet.size()); //학번이 같으면 같은 사람으로 인식하게 설계했기 때문에, 김길동과 박길동은 같은 사람으로 인식한다.
		
	}
}
