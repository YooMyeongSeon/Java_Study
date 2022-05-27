package chap1;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ex06TreeMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> students = new TreeMap<>();
		
		students.put("고길동", 90);
		students.put("김길동", 70);
		students.put("이길동", 80);
		students.put("박길동", 50);
		students.put("홍길동", 60);
		students.put("유길동", 30);
		students.put("최길동", 40);
		
		System.out.println("첫번째 순서의 이름 : " + students.firstEntry().getKey());
		System.out.println("첫번째 순서의 점수 : " + students.firstEntry().getValue());
		System.out.println("마지막 순서의 이름 : " + students.lastEntry().getKey());
		System.out.println("마지막 순서의 점수 : " + students.lastEntry().getValue());
		
		System.out.println("유길동 전 순서 이름 : " + students.lowerEntry("유길동"));
		System.out.println("유길동 다음 순서 이름 : " + students.higherEntry("유길동"));
		System.out.println("유길동보다 작거나 같은 이름 : " + students.floorEntry("유길동"));
		System.out.println("배길동보다 작거나 같은 이름 : " + students.floorEntry("배길동"));
		System.out.println("유길동보다 크거나 같은 이름 : " + students.ceilingEntry("유길동"));
		System.out.println("배길동보다 크거나 같은 이름 : " + students.ceilingEntry("배길동"));
		
		//전체 데이터 정렬 조회
		Set<Map.Entry<String, Integer>> studentsEntrySet = students.entrySet();
		
		Iterator<Map.Entry<String, Integer>> studentsEntrySetItr = studentsEntrySet.iterator(); //셋 안의 내용을 반복자롤 통해서 나열하는 작업
		
		while (studentsEntrySetItr.hasNext()) {
			Map.Entry<String, Integer> studentsEntry = studentsEntrySetItr.next();
			
			String name = studentsEntry.getKey();
			Integer score = studentsEntry.getValue();
			
			System.out.println(name + "의 점수 : " + score);
		}
	}
}
