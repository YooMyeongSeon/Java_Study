package chap1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex04Map {

	public static void main(String[] args) {
		HashMap<Integer, Student> stuList = new HashMap<>(); //<>안의 타입은 키, 벨류 타입
		stuList.put(1, new Student(1, "콩순이", 7));
		stuList.put(2, new Student(2, "묘선이", 19));
		stuList.put(2, new Student(3, "꺼꾸리", 26)); //존재하는 키로 입력하면 기존 키에 있는 값을 지우고 다시 생성
		
		System.out.println(stuList.size()); //입력된 맵의 갯수 확인
		
		String name = stuList.get(2).getStuName(); //변수에 이름을 가져와 할당
		System.out.println("2번 학생 이름 : " + name);
		System.out.println("------------------------------");
		
		//맵 내부 전체 데이터를 읽어오는 방법 : Set으로 변경한 후 반복자를 이용하는 방법
		//1-1. 키를 Set으로 바꾸는 방법
		Set<Integer> stuListKeySet = stuList.keySet(); //Set의 타입을 숫자로 지정하고, 맵의 키를 가져옴
		
		Iterator<Integer> stuListKeySetItr = stuListKeySet.iterator();
		
		while (stuListKeySetItr.hasNext()) { //stuListKeySetItr이 다음것을 가지고 있느냐,
			int stuListKey = stuListKeySetItr.next();
			Student stuListValue = stuList.get(stuListKey);
			
			System.out.println(stuListKey + "번 학생 이름 : " + stuListValue.getStuName());
		}
		System.out.println("------------------------------");
		//1-2. 엔트리를 Set으로 바꾸는 방법
		Set<Map.Entry<Integer, Student>> stuListEntrySet = stuList.entrySet();
		
		Iterator<Map.Entry<Integer, Student>> stuListEntrySetItr = stuListEntrySet.iterator();
		
		while (stuListEntrySetItr.hasNext()) {
			Map.Entry<Integer, Student> stuListEntry = stuListEntrySetItr.next();
			Integer stuListKey = stuListEntry.getKey();
			Student stuListValue = stuListEntry.getValue();
			
			System.out.println(stuListKey + "번 학생의 이름 : " + stuListValue.getStuName());
		}
		
		System.out.println("------------------------------");
		if (stuList.containsKey(2)) { //2번 학생이 있느냐(불린)이 조건
			System.out.println("이름 : " + stuList.get(2).getStuName()); 
		} else {
			System.out.println("해당 번호 학생이 존재하지 않습니다.");
		}
	}
}
