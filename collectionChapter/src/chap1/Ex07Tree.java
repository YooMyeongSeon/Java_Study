package chap1;

import java.util.TreeMap;
import java.util.TreeSet;

public class Ex07Tree {

	public static void main(String[] args) {
		TreeSet<Student> stuSet = new TreeSet<>(new Teacher());
		
		stuSet.add(new Student(7, "��浿", 55));
		stuSet.add(new Student(5, "��浿", 52));
		stuSet.add(new Student(6, "�̱浿", 56));
		stuSet.add(new Student(4, "�ڱ浿", 57));
		stuSet.add(new Student(3, "ȫ�浿", 51));
		
		TreeMap<Student, String> stuMap = new TreeMap<>(new Teacher()); //Teacher�� ���� ���� ���ؿ� ���Ͽ� Ű�� �ش��ϴ� �л��� ���ĵǾ� �Էµȴ�.
		
		
	}
}
