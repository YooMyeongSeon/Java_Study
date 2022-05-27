package BankProgram;

import java.util.Scanner;

public class Service {
	static Scanner scan = new Scanner(System.in);
	
	public static void accountCreate() {
		if (Main.accountList[99] != null) {
			System.out.println("���̻� ���¸� ������ �� �����ϴ�.");
		} else {
			System.out.println("==============================");
			System.out.println("���¸� �����մϴ�.");
			System.out.println("==============================");
			System.out.println("�̸��� �Է��ϼ���.");
			String name = scan.nextLine();
			int accountNum;
			while (true) {
				boolean overlap = false;
				System.out.println("���¹�ȣ�� �Է��ϼ���.(�ߺ� �Ұ�)");
				accountNum = Integer.parseInt(scan.nextLine());
				for (int i=0; i<Main.accountList.length; i++) {
					if (Main.accountList[i] != null) {
						if (Main.accountList[i].accountNum == accountNum) {
							System.out.println("�Է��Ͻ� ���¹�ȣ�� �����մϴ�.");
							overlap = true;
							break;
						}
					}
				}
				if (overlap == false) {
					break;
				}
			}
			System.out.println("��й�ȣ�� �Է��ϼ���.");
			int password = Integer.parseInt(scan.nextLine());
			System.out.println("�ʱ� ���ݾ��� �Ա��ϼ���.");
			int money = Integer.parseInt(scan.nextLine());
			Account account = new Account(name, accountNum, password, money);
			for (int i=0; i<Main.accountList.length; i++) {
				if (Main.accountList[i] == null) {
					Main.accountList[i] = account;
					break;
				}
			}
		}
	}
	//
	public static void accountAbout() {
		boolean complet = false;
		System.out.println("��ȸ�� ���¹�ȣ�� �Է��ϼ���.");
		int accountNum = Integer.parseInt(scan.nextLine());
		for (int i=0; i<Main.accountList.length; i++) {
			if (Main.accountList[i] != null) {
				if (Main.accountList[i].accountNum == accountNum) {
					System.out.println("���� ��й�ȣ�� �Է��ϼ���.");
					int password = Integer.parseInt(scan.nextLine());
						if (Main.accountList[i].password == password) {
							System.out.println("==============================");
							System.out.println("������ : " + Main.accountList[i].name);
							System.out.println("���ݾ� : " + Main.accountList[i].money);
							System.out.println("==============================");
						} else {
							System.out.println("���� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
						}
					complet = true;
					break;
				}
			}
		}
		if (complet == false) {
			System.out.println("�Է��Ͻ� ���°� �������� �ʽ��ϴ�.");
		}
	}
	//
	public static void accountDeposit() {
		boolean complet = false;
		System.out.println("�Ա��� ���¹�ȣ�� �Է��ϼ���.");
		int accountNum = Integer.parseInt(scan.nextLine());
		for (int i=0; i<Main.accountList.length; i++) {
			if (Main.accountList[i] != null) {
				if (Main.accountList[i].accountNum == accountNum) {
					System.out.println("�Ա��� �ݾ��� �Է��ϼ���.");
					int money = Integer.parseInt(scan.nextLine());
					Main.accountList[i].money += money;
					System.out.println(money + "���� �ԱݵǾ����ϴ�.");
					System.out.println("�� ���ݾ��� " + Main.accountList[i].money + "�� �Դϴ�.");
					complet = true;
					break;
				}
			}
		}
		if (complet == false) {
			System.out.println("�Է��Ͻ� ���°� �������� �ʽ��ϴ�.");
		}
	}
	//
	public static void accountWithdraw() {
		boolean complet = false;
		System.out.println("����� ���¹�ȣ�� �Է��ϼ���.");
		int accountNum = Integer.parseInt(scan.nextLine());
		for (int i=0; i<Main.accountList.length; i++) {
			if (Main.accountList[i] != null) {
				if (Main.accountList[i].accountNum == accountNum) {
					System.out.println("���� ��й�ȣ�� �Է��ϼ���.");
					int password = Integer.parseInt(scan.nextLine());
						if (Main.accountList[i].password == password) {
							System.out.println("����� �ݾ��� �Է��ϼ���.");
							int withdrawMoney = Integer.parseInt(scan.nextLine());
							if (Main.accountList[i].money >= withdrawMoney) {
								Main.accountList[i].money -= withdrawMoney;
								System.out.println(withdrawMoney + "���� ��ݵǾ����ϴ�.");
								System.out.println("�� ���ݾ��� " + Main.accountList[i].money + "�� �Դϴ�.");
							} else {
								System.out.println("�ܾ��� �����մϴ�.");
							}
						} else {
							System.out.println("���� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
						}
					complet = true;
					break;
				}
			}
		}
		if (complet == false) {
			System.out.println("�Է��Ͻ� ���°� �������� �ʽ��ϴ�.");
		}
	}
}
