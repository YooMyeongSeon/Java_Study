package chap2;

public class Person_Example {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println("p1의 nation : "+p1.nation);
		System.out.println("p1의 name : "+p1.name);
		System.out.println("p1의 ssn : "+p1.ssn);
		System.out.println();
		
//		p1.nation = "USA";
//		p1.ssn = "234567-1234567";  fianl 필드는 수정이 불가능하다.
		p1.name = "유명선";
		
		System.out.println("p1의 수정 후 name : "+p1.name);
	}

}
