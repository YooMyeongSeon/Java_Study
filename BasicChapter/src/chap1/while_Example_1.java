package chap1;

import java.util.Scanner;

public class while_Example_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
		
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܾ���ȸ | 4. ����");
			System.out.println("-------------------------------------");
			System.out.println("�޴��� ��ȣ�� �����ϼ��� : ");
			int num = scanner.nextInt();
			
			switch (num) {
			case 1 :
				System.out.println("�Ա��� �ݾ��� �Է��ϼ��� : ");
				int i_money = scanner.nextInt();
				balance += i_money;
				System.out.printf("[%d�� �� �Ա� �Ǿ����ϴ�.]\n",i_money);
				System.out.printf("[�ܾ��� %d�� �Դϴ�.]",balance);
				System.out.println();
				break;
			case 2 :
				if (balance ==0) {
					System.out.println("[�ܾ��� �����մϴ�.]");
					break;
				} else {
					System.out.println("����� �ݾ��� �Է��ϼ��� : ");
					int o_money = scanner.nextInt();
					if (o_money <= balance) {
						balance -= o_money;
						System.out.printf("[%d�� �� ��� �Ǿ����ϴ�.]\n",o_money);
						System.out.printf("[�ܾ��� %d�� �Դϴ�.]",balance);
						System.out.println();
					} else {
						System.out.println("[�ܾ��� �����մϴ�.]");
					} break;
				}
			case 3 :
				System.out.printf("[�ܾ��� %d�� �Դϴ�.]",balance);
				System.out.println();
				break;
			case 4 :
				System.out.println("[�ý����� �����մϴ�.]");
				run = false;
				break;
			default :
				System.out.println("[�ùٸ� �Է��� �ƴմϴ�.]");
			}
		}
	}
}