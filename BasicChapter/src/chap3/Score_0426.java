package chap3;

import java.util.Scanner;

public class Score_0426 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		int score = scan.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("�Էµ� ������ "+score+"�Դϴ�.");
			System.out.println("������ A���� �Դϴ�.");
			break;
		case 8:
			System.out.println("�Էµ� ������ "+score+"�Դϴ�.");
			System.out.println("������ B���� �Դϴ�.");
			break;
		case 7:
			System.out.println("�Էµ� ������ "+score+"�Դϴ�.");
			System.out.println("������ C���� �Դϴ�.");
			break;
		case 6:
			System.out.println("�Էµ� ������ "+score+"�Դϴ�.");
			System.out.println("������ D���� �Դϴ�.");
			break;
		default :
			System.out.println("�Էµ� ������ "+score+"�Դϴ�.");
			System.out.println("������ F���� �Դϴ�.");
		}
	}

}
