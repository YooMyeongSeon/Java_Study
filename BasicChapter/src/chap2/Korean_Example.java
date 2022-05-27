package chap2;

public class Korean_Example {

	public static void main(String[] args) {
		Korean k1 = new Korean("유자바", "011225-1234567");
		System.out.println("k1의 이름 : "+k1.name);
		System.out.println("k1의 주민번호 : "+k1.ssn);
		System.out.println();
		Korean k2 = new Korean("김자바", "021225-1234567");
		System.out.println("k2의 이름 : "+k2.name);
		System.out.println("k2의 주민번호 : "+k2.ssn);
	}

}
