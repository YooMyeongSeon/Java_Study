package chap2;

public class Person_Example {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "ȫ�浿");
		
		System.out.println("p1�� nation : "+p1.nation);
		System.out.println("p1�� name : "+p1.name);
		System.out.println("p1�� ssn : "+p1.ssn);
		System.out.println();
		
//		p1.nation = "USA";
//		p1.ssn = "234567-1234567";  fianl �ʵ�� ������ �Ұ����ϴ�.
		p1.name = "����";
		
		System.out.println("p1�� ���� �� name : "+p1.name);
	}

}
