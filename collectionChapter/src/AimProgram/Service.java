package AimProgram;

import java.util.Scanner;

public class Service {
	static Scanner scan = new Scanner(System.in);

	public Service() {
		menu();
	}

	public void menu() {
		boolean run = true;
		
		do {
			System.out.println("==============================");
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("3. ����");
			System.out.println("==============================");
			System.out.println("���ϴ� �޴��� ��ȣ�� �Է��ϼ��� : ");
			int selectNum = Integer.parseInt(scan.nextLine());
			switch (selectNum) {
			case 1 : 
				signUp();
				break;
			case 2 :
				login();
				break;
			case 3 :
				run = exit();
				break;
			default :
				System.out.println("�ùٸ� �Է��� �ƴմϴ�.");
			}
		} while (run);
	}
	
	public void signUp() {
		System.out.println("ȸ������ �޴��� �����߽��ϴ�.");
		boolean Typerun = true;
		boolean userType = false;
		do {
			System.out.println("���� ������ �����ϼ���.");
			System.out.println("==============================");
			System.out.println("1. ����");
			System.out.println("2. �л�");
			System.out.println("==============================");
			int selectNum = Integer.parseInt(scan.nextLine());
			switch (selectNum) {
			case 1 : 
				userType = true;
				Typerun = false;
				break;
			case 2 :
				userType = false;
				Typerun = false;
				break;
			default :
				System.out.println("�ùٸ� �Է��� �ƴմϴ�.");
			}
		} while (Typerun);
		System.out.println("�̸��� �Է��ϼ��� : ");
		String userName = scan.nextLine();
		String userId;
		while (true) {
			boolean overlap = false;
			System.out.println("����Ͻ� ���̵� �Է��ϼ���(�ߺ��Ұ�) : ");
			userId = scan.nextLine();
			if (Main.memberlist != null) {
				for (int i=0; i<Main.memberlist.size(); i++) {
					if (Main.memberlist.get(i).id.equals(userId)) {
						System.out.println("�Է��Ͻ� ���̵� �����մϴ�.");
						overlap = true;
						break;
					}
				}
			}
			if (overlap == false) {
				break;
			}
		}
		System.out.println("����Ͻ� ��й�ȣ�� �Է��ϼ��� : ");
		String userPw = scan.nextLine();
		System.out.println("��й�ȣ�� �ٽ� �� �� �Է��ϼ��� : ");
		String userPwCheck = scan.nextLine();
		while (true) {
			if (userPw.equals(userPwCheck)) {
				System.out.println("�Է��Ͻ� ��й�ȣ�� ��ġ�մϴ�.");
				break;
			} else {
				System.out.println("�Է��Ͻ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�!");
				System.out.println("����Ͻ� ��й�ȣ�� �Է��ϼ��� : ");
				userPw = scan.nextLine();
				System.out.println("��й�ȣ�� �ٽ� �� �� �Է��ϼ��� : ");
				userPwCheck = scan.nextLine();
			}
		}
		String usersSubject = null;
		String usersMajor = null;
		if (userType == true) {
			System.out.println("��� ������ �Է����ּ���. : ");
			usersSubject  = scan.nextLine();
		} else {
			System.out.println("������ �Է����ּ���. : ");
			usersMajor  = scan.nextLine();
		}
		System.out.println("ȸ�������� �����մϴ�!");
		if (userType == true) {
			Teacher member = new Teacher(userName, userId, userPw, usersSubject);
			Main.memberlist.add(member);
		} else {
			Student member = new Student(userName, userId, userPw, usersMajor);
			Main.memberlist.add(member);
		}
	}
	
	public void login() {
		
	}
	
	public boolean exit() {
		System.out.println("�����Ͻðڽ��ϱ�?(Y/N) : ");
		String answer = scan.nextLine();
		if (answer.equals("Y")  || answer.equals("y")) {
			System.out.println("���α׷��� �����մϴ�.");
			return false;
		} else if (answer.equals("N") || answer.equals("n")) {
			return true;
		} else {
			System.out.println("�ùٸ� �Է��� �ƴմϴ�.");
			return true;
		}
	}
}