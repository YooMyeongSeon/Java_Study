package chap1;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ȸ�� ����� �Է��ϼ��� : ");
		String grade = scanner.nextLine();
		
		switch (grade){
		
		case "A":
		case "a":
			System.out.println("���ȸ�� �Դϴ�!");
			break;
		case "B":
		case "b":
			System.out.println("�Ϲ�ȸ�� �Դϴ�!");
			break;
		case "C":
		case "c":
			System.out.println("�մ� �Դϴ�!");
			break;
		default	:
			System.out.println("�ùٸ� �Է��� �ƴմϴ�.");
			break;
		}
	}

}