package chap2;

public class Student_Example {

	public static void main(String[] args) {
		Student yoo = new Student("유명선", "900210-1234567", 23);
		
		System.out.println("이름 : " + yoo.name);
		System.out.println("주민번호 : " + yoo.ssn);
		System.out.println("학생번호 : " + yoo.studentNo);
	}

}
