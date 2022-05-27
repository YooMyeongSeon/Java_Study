package chap1;

import java.util.Comparator;

public class Teacher implements Comparator<Student>{
	
	@Override
	public int compare(Student n1, Student n2) {
		if (n1.getAge() > n2.getAge()) {
			return 1;
		} else if (n1.getAge() < n2.getAge()) {
			return -1;
		} else {
			return 0;
		}
	}
}
