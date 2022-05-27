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
			System.out.println("1. 계좌 생성");
			System.out.println("2. 계좌 조회");
			System.out.println("3. 계좌 입금");
			System.out.println("4. 계좌 출금");
			System.out.println("5. 종료");
			System.out.println("==============================");
			System.out.println("원하는 메뉴의 번호를 입력하세요 : ");
			int selectNum = Integer.parseInt(scan.nextLine());
			
			switch (selectNum) {
			case 0 :
				for (int i=0; i<100; i++) {
					Account account = new Account("더미", 1234, 1234, 1000);
					accountList[i] = account;
				}
				System.out.println("더미 계좌 100개 생성 완료");
				break;
			case 1 :
				Service.accountCreate();
				break;
			case 2 :
				if (accountList[0] != null) {
					Service.accountAbout();
				} else {
					System.out.println("계좌가 생성되지 않았습니다.");
				}
				break;
			case 3 :
				if (accountList[0] != null) {
					Service.accountDeposit();
				} else {
					System.out.println("계좌가 생성되지 않았습니다.");
				}
				break;
			case 4 :
				if (accountList[0] != null) {
					Service.accountWithdraw();
				} else {
					System.out.println("계좌가 생성되지 않았습니다.");
				}
				break;
			case 5 :
				System.out.println("종료하시겠습니까?(Y/N) : ");
				String answer = scan.nextLine();
				if (answer.equals("Y")  || answer.equals("y")) {
					System.out.println("프로그램을 종료합니다.");
					run = false;
				} else if (answer.equals("N") || answer.equals("n")) {
					run = true;
				} else {
					System.out.println("올바른 입력이 아닙니다.");
					run = true;
				}
				break;
			default :
				System.out.println("올바른 입력이 아닙니다.");
			};
		} while (run);
	}
}
