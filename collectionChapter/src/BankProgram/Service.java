package BankProgram;

import java.util.Scanner;

public class Service {
	static Scanner scan = new Scanner(System.in);
	
	public static void accountCreate() {
		if (Main.accountList[99] != null) {
			System.out.println("더이상 계좌를 생성할 수 없습니다.");
		} else {
			System.out.println("==============================");
			System.out.println("계좌를 생성합니다.");
			System.out.println("==============================");
			System.out.println("이름을 입력하세요.");
			String name = scan.nextLine();
			int accountNum;
			while (true) {
				boolean overlap = false;
				System.out.println("계좌번호를 입력하세요.(중복 불가)");
				accountNum = Integer.parseInt(scan.nextLine());
				for (int i=0; i<Main.accountList.length; i++) {
					if (Main.accountList[i] != null) {
						if (Main.accountList[i].accountNum == accountNum) {
							System.out.println("입력하신 계좌번호가 존재합니다.");
							overlap = true;
							break;
						}
					}
				}
				if (overlap == false) {
					break;
				}
			}
			System.out.println("비밀번호를 입력하세요.");
			int password = Integer.parseInt(scan.nextLine());
			System.out.println("초기 예금액을 입금하세요.");
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
		System.out.println("조회할 계좌번호를 입력하세요.");
		int accountNum = Integer.parseInt(scan.nextLine());
		for (int i=0; i<Main.accountList.length; i++) {
			if (Main.accountList[i] != null) {
				if (Main.accountList[i].accountNum == accountNum) {
					System.out.println("계좌 비밀번호를 입력하세요.");
					int password = Integer.parseInt(scan.nextLine());
						if (Main.accountList[i].password == password) {
							System.out.println("==============================");
							System.out.println("예금주 : " + Main.accountList[i].name);
							System.out.println("예금액 : " + Main.accountList[i].money);
							System.out.println("==============================");
						} else {
							System.out.println("계좌 비밀번호가 일치하지 않습니다.");
						}
					complet = true;
					break;
				}
			}
		}
		if (complet == false) {
			System.out.println("입력하신 계좌가 존재하지 않습니다.");
		}
	}
	//
	public static void accountDeposit() {
		boolean complet = false;
		System.out.println("입금할 계좌번호를 입력하세요.");
		int accountNum = Integer.parseInt(scan.nextLine());
		for (int i=0; i<Main.accountList.length; i++) {
			if (Main.accountList[i] != null) {
				if (Main.accountList[i].accountNum == accountNum) {
					System.out.println("입금할 금액을 입력하세요.");
					int money = Integer.parseInt(scan.nextLine());
					Main.accountList[i].money += money;
					System.out.println(money + "원이 입금되었습니다.");
					System.out.println("총 예금액은 " + Main.accountList[i].money + "원 입니다.");
					complet = true;
					break;
				}
			}
		}
		if (complet == false) {
			System.out.println("입력하신 계좌가 존재하지 않습니다.");
		}
	}
	//
	public static void accountWithdraw() {
		boolean complet = false;
		System.out.println("출금할 계좌번호를 입력하세요.");
		int accountNum = Integer.parseInt(scan.nextLine());
		for (int i=0; i<Main.accountList.length; i++) {
			if (Main.accountList[i] != null) {
				if (Main.accountList[i].accountNum == accountNum) {
					System.out.println("계좌 비밀번호를 입력하세요.");
					int password = Integer.parseInt(scan.nextLine());
						if (Main.accountList[i].password == password) {
							System.out.println("출금할 금액을 입력하세요.");
							int withdrawMoney = Integer.parseInt(scan.nextLine());
							if (Main.accountList[i].money >= withdrawMoney) {
								Main.accountList[i].money -= withdrawMoney;
								System.out.println(withdrawMoney + "원이 출금되었습니다.");
								System.out.println("총 예금액은 " + Main.accountList[i].money + "원 입니다.");
							} else {
								System.out.println("잔액이 부족합니다.");
							}
						} else {
							System.out.println("계좌 비밀번호가 일치하지 않습니다.");
						}
					complet = true;
					break;
				}
			}
		}
		if (complet == false) {
			System.out.println("입력하신 계좌가 존재하지 않습니다.");
		}
	}
}
