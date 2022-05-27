package chap1;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수정보입력]");
		System.out.println("1. 이름 : ");
		String name = scanner.nextLine();
		
		System.out.println("2. 주민번호 앞 6자리 : ");
		String juminNum = scanner.nextLine();
		
		System.out.println("3. 전화번호 : ");
		String phoneNum = scanner.nextLine();
		
		System.out.println();
		
		System.out.println("[입력된 내용]");
		System.out.println("1. 이름 : "+name);
		System.out.println("2. 주민번호 앞 6자리 : "+juminNum);
		System.out.println("3. 전화번호 : "+phoneNum);
	}
}