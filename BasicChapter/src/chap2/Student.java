package chap2;

public class Student extends People{
	public int studentNo;
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //�θ� �����ڸ� ȣ��
		this.studentNo = studentNo;
	}
}
