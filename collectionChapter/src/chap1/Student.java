package chap1;

public class Student implements Comparable<Student>{ //예제 클래스
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
	public int hashCode() { //1차 검진 : hashCode가 다르면 다른 사람이며, 같다면 같은 사람일 수도 있고, 다른사람 일 수도 있다.
		return stuNum; //학번이 다르다면, 다른 사람이다.
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) { //2차 검진 : 전달 받은 오브젝트 객체가 학생인지 판단한다, 참이면 같은 사람이고, 거짓이면 다른 사람이다.
			Student stu = (Student)obj;
			return (stu.getStuNum() == this.stuNum) ? true : false; //조건이 맞다면 참, 틀리다면 거짓을 반환
		} else {
			return false;
		}
	}
	
	@Override
	public int compareTo(Student n) { //학생 이름을 비교 기준으로 만들기
		return stuName.compareTo(n.getStuName());
	}
	
//	@Override
//	public int compareTo(Student n) {
//		if (stuNum > n.getStuNum()) { //내가 더 크다면 양수
//			return 99999;
//		} else if (stuNum < n.getStuNum()) { //내가 더 작다면 음수
//			return -99999;
//		} else { //같다면 0
//			return 0;
//		}
//		
//	}
}
