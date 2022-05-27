package chap1;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("회원 등급을 입력하세요 : ");
		String grade = scanner.nextLine();
		
		switch (grade){
		
		case "A":
		case "a":
			System.out.println("우수회원 입니다!");
			break;
		case "B":
		case "b":
			System.out.println("일반회원 입니다!");
			break;
		case "C":
		case "c":
			System.out.println("손님 입니다!");
			break;
		default	:
			System.out.println("올바른 입력이 아닙니다.");
			break;
		}
	}

}