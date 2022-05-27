package BankProgram;

import java.util.Scanner;

public class Main {
	final static int MAXAC = 100;
	int C = 2;
	
	static Account[] accountList = new Account[MAXAC];
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		do {
			System.out.println("==============================");
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ��ȸ");
			System.out.println("3. ���� �Ա�");
			System.out.println("4. ���� ���");
			System.out.println("5. ����");
			System.out.println("==============================");
			System.out.println("���ϴ� �޴��� ��ȣ�� �Է��ϼ��� : ");
			int selectNum = Integer.parseInt(scan.nextLine());
			
			switch (selectNum) {
			case 0 :
				for (int i=0; i<100; i++) {
					Account account = new Account("����", 1234, 1234, 1000);
					accountList[i] = account;
				}
				System.out.println("���� ���� 100�� ���� �Ϸ�");
				break;
			case 1 :
				Service.accountCreate();
				break;
			case 2 :
				if (accountList[0] != null) {
					Service.accountAbout();
				} else {
					System.out.println("���°� �������� �ʾҽ��ϴ�.");
				}
				break;
			case 3 :
				if (accountList[0] != null) {
					Service.accountDeposit();
				} else {
					System.out.println("���°� �������� �ʾҽ��ϴ�.");
				}
				break;
			case 4 :
				if (accountList[0] != null) {
					Service.accountWithdraw();
				} else {
					System.out.println("���°� �������� �ʾҽ��ϴ�.");
				}
				break;
			case 5 :
				System.out.println("�����Ͻðڽ��ϱ�?(Y/N) : ");
				String answer = scan.nextLine();
				if (answer.equals("Y")  || answer.equals("y")) {
					System.out.println("���α׷��� �����մϴ�.");
					run = false;
				} else if (answer.equals("N") || answer.equals("n")) {
					run = true;
				} else {
					System.out.println("�ùٸ� �Է��� �ƴմϴ�.");
					run = true;
				}
				break;
			default :
				System.out.println("�ùٸ� �Է��� �ƴմϴ�.");
			};
		} while (run);
	}
}
