package chap1;

public class StringExample {

	public static void main(String[] args) {
		String name = "유명선";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job+"\n");
		//이스케이프 문자
		String str1 = "나는 \"자바\"를 좋아합니다.";
		String str2 = "It's fine";
		String str3 = "번호\t이름\t나이";
		String str4 = "유명선\n\n\n홍길동";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("봄\\여름\\가을\\겨울");
	}

}
