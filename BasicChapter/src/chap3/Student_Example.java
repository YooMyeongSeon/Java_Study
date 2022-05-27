package chap3;

class People {
	public String name;
	public String ssn;
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

class Student extends People{
	public int studentNo;
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}

public class Student_Example {

	public static void main(String[] args) {
		Student yoo = new Student("유명선", "900210-1234567", 23);
		
		System.out.println("이름 : " + yoo.name);
		System.out.println("주민번호 : " + yoo.ssn);
		System.out.println("학생번호 : " + yoo.studentNo);
	}
}
