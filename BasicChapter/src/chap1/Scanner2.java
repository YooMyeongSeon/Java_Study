package chap1;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[�ʼ������Է�]");
		System.out.println("1. �̸� : ");
		String name = scanner.nextLine();
		
		System.out.println("2. �ֹι�ȣ �� 6�ڸ� : ");
		String juminNum = scanner.nextLine();
		
		System.out.println("3. ��ȭ��ȣ : ");
		String phoneNum = scanner.nextLine();
		
		System.out.println();
		
		System.out.println("[�Էµ� ����]");
		System.out.println("1. �̸� : "+name);
		System.out.println("2. �ֹι�ȣ �� 6�ڸ� : "+juminNum);
		System.out.println("3. ��ȭ��ȣ : "+phoneNum);
	}
}