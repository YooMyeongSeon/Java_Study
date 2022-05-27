package chap3;

import java.util.Scanner;

public class BankApplication{
	private static final int MAX_ACCOUNT = 2; //�ִ� ���� ���� ��
	private static final boolean SUCCESS = true; //�Ա�&��� �ݾ�Ȯ��
	
	private static Account[] accountArray = new Account[MAX_ACCOUNT];
	private static Scanner scan = new Scanner(System.in); //�Է¹� ȣ��
	
	public static void main(String[] args) { //���� �޼ҵ�
		boolean run = true; //���� ����ġ
		
		while (run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1.���� ���� | 2.���� ��� | 3.�Ա� | 4.��� | 5.���� ���� | 6.����");
			System.out.println("------------------------------------------------------------");
			System.out.println("���Ͻô� �޴��� ��ȣ�� �Է��ϼ��� : ");
			String sel = scan.nextLine();
			
			switch (sel) {
			case "1" :
				c_Account(); //���»��� �Լ� ȣ��
				break;
			case "2" :
				account_List();  //���¸�� �Լ� ȣ��
				break;
			case "3" :
				deposit(); //�Ա� �Լ� ȣ��
				break;
			case "4" :
				withdraw(); //��� �Լ� ȣ��
				break;
			case "5" :
				remove_Account(); //�������� �Լ� ȣ��
				break;
			case "6" :
				System.out.println("[�ý����� �����մϴ�.]");
				run = false;
				break;
			default :
				System.out.println("[�߸��� �Է��Դϴ�.]");
			}
		}
	}
	
	private static void c_Account() { //���»��� �Լ�
		int e_Account_Index = fe_Account(); //���� �� Ȯ�� �Լ� ȣ��
		if (e_Account_Index == -1) {
			System.out.println("[���¸� ���̻� ������ �� �����ϴ�.]");
		} else {
			System.out.println("[���¸� �����մϴ�.]");
			System.out.println("������ ���¹�ȣ�� �Է��ϼ��� : ");
			String accountNo = scan.nextLine();
			System.out.println("�����ָ� �Է��ϼ��� : ");
			String accountName = scan.nextLine();
			accountArray[e_Account_Index] = new Account(accountNo, accountName, 0);
			System.out.println("[�����մϴ�, ���°� �����Ǿ����ϴ�.]");
		}
	}
	
	private static void account_List() { //���¸�� �Լ� ȣ��
		System.out.println("[���� ����Դϴ�.]");
		for (int i=0; i<MAX_ACCOUNT; i++) {
			Account account = accountArray[i];
			if (account != null) {
				System.out.printf("%7s%6s%8d\n",account.getAno(), account.getName(), account.getBalance());
			}
		}
	}
	
	private static int fe_Account() { //���� �� Ȯ�� �Լ�
		for (int i=0; i<MAX_ACCOUNT; i++) { //0���� 1���� Ȯ��(2�̸�)
			if (accountArray[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	private static void deposit() { //�Ա� �Լ�
		System.out.println("[�Ա� �ý��� �Դϴ�.]");
		System.out.println("���¹�ȣ�� �Է��ϼ��� : ");
		String ano = scan.nextLine();
		Account account = find_Account(ano); //���� ã�� �Լ� ȣ��
		if (account == null) {
			System.out.println("[���¹�ȣ�� Ȯ���ϼ���.]");
			return;
		} else {
			System.out.println("�Ա��� �ݾ��� �Է��ϼ��� : ");
			int money = scan.nextInt();
			if (account.i_Balance(money) == SUCCESS) {
				System.out.println("[���������� ���ݵǾ����ϴ�.]");
			} else {
				System.out.println("[�ܰ� �ѵ��� �ʰ��մϴ�.]");
			}
		}
	}
	
	private static void withdraw() { //����Լ�
		System.out.println("[��� �ý��� �Դϴ�.]");
		System.out.println("���¹�ȣ�� �Է��ϼ��� : ");
		String ano = scan.nextLine();
		Account account = find_Account(ano); //���� ã�� �Լ� ȣ��
		if (account == null) {
			System.out.println("[���¹�ȣ�� Ȯ���ϼ���.]");
			return;
		} else {
			System.out.println("����� �ݾ��� �Է��ϼ��� : ");
			int money = scan.nextInt();
			if (account.d_Balance(money) == SUCCESS) {
				System.out.println("[���������� ��ݵǾ����ϴ�.]");
			} else {
				System.out.println("[�ܾ��� �����մϴ�.]");
			}
		}
	}
	
	private static void remove_Account( ) {
		System.out.println("[���¸� �����մϴ�.]");
		System.out.println("���¹�ȣ�� �Է��ϼ��� : ");
		String ano = scan.nextLine();
		int accountIndex = find_Account_Index(ano); //���� �˻� �Լ� ȣ��
		if (accountIndex == -1) {
			System.out.println("[���¹�ȣ�� Ȯ���ϼ���.]");
			return;
		} else {
			System.out.println("�����ָ� �Է��ϼ���. : ");
			String owner = scan.nextLine();
			Account account = accountArray[accountIndex];
			if (account.getName().equals(owner)) {
				accountArray[accountIndex] = null;
				System.out.println("[���°� �����Ǿ����ϴ�.]");
			} else {
				System.out.println("[�����ָ� Ȯ���ϼ���.]");
			}
			
		}
	}
	
	private static Account find_Account(String ano) { //���� ã�� �Լ�
		int account_Index = find_Account_Index(ano);
		if (account_Index == -1) {
			return null;
		} else {
			return accountArray[account_Index];
		}
	}
	
	private static int find_Account_Index(String ano) { //���� �˻� �Լ�
		for (int i=0; i<MAX_ACCOUNT; i++) {
			if (accountArray[i] != null && ano.equals(accountArray[i].getAno())) {
				return i;
			}
		}
		return -1;
	}
}
