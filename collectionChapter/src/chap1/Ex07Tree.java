package chap1;

import java.util.TreeMap;
import java.util.TreeSet;

public class Ex07Tree {

	public static void main(String[] args) {
		TreeSet<Student> stuSet = new TreeSet<>(new Teacher());
		
		stuSet.add(new Student(7, "고길동", 55));
		stuSet.add(new Student(5, "김길동", 52));
		stuSet.add(new Student(6, "이길동", 56));
		stuSet.add(new Student(4, "박길동", 57));
		stuSet.add(new Student(3, "홍길동", 51));
		
		TreeMap<Student, String> stuMap = new TreeMap<>(new Teacher()); //Teacher가 가진 정렬 기준에 의하여 키에 해당하는 학생이 정렬되어 입력된다.
		
		
	}
}
