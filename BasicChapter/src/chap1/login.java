package chap1;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.println("���̵� �Է��ϼ���");
		String userId = input.nextLine();
		
		System.out.println("��й�ȣ�� �Է��ϼ���");
		String userPw = input.nextLine();
		int intUserPw = Integer.parseInt(userPw);
		
		if ((userId.equals("java")) & (12345 == intUserPw)) {
			System.out.println("�α��ο� ���� �Ͽ����ϴ�.");
		}
		else if (userId != "java") {
			System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
		}
		else {
			System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
		}
	}
}
