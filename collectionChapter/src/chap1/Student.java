package chap1;

public class Student implements Comparable<Student>{ //���� Ŭ����
	private int stuNum;
	private String stuName;
	private int age;
	private char gender;
	
	public Student(int stuNum, String stuName, int age) {
		super();
		this.stuNum = stuNum;
		this.stuName = stuName;
		this.age = age;
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public int hashCode() { //1�� ���� : hashCode�� �ٸ��� �ٸ� ����̸�, ���ٸ� ���� ����� ���� �ְ�, �ٸ���� �� ���� �ִ�.
		return stuNum; //�й��� �ٸ��ٸ�, �ٸ� ����̴�.
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) { //2�� ���� : ���� ���� ������Ʈ ��ü�� �л����� �Ǵ��Ѵ�, ���̸� ���� ����̰�, �����̸� �ٸ� ����̴�.
			Student stu = (Student)obj;
			return (stu.getStuNum() == this.stuNum) ? true : false; //������ �´ٸ� ��, Ʋ���ٸ� ������ ��ȯ
		} else {
			return false;
		}
	}
	
	@Override
	public int compareTo(Student n) { //�л� �̸��� �� �������� �����
		return stuName.compareTo(n.getStuName());
	}
	
//	@Override
//	public int compareTo(Student n) {
//		if (stuNum > n.getStuNum()) { //���� �� ũ�ٸ� ���
//			return 99999;
//		} else if (stuNum < n.getStuNum()) { //���� �� �۴ٸ� ����
//			return -99999;
//		} else { //���ٸ� 0
//			return 0;
//		}
//		
//	}
}
