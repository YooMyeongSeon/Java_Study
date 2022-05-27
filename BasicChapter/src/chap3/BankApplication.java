package chap3;

import java.util.Scanner;

public class BankApplication{
	private static final int MAX_ACCOUNT = 2; //최대 계좌 생성 수
	private static final boolean SUCCESS = true; //입금&출금 금액확인
	
	private static Account[] accountArray = new Account[MAX_ACCOUNT];
	private static Scanner scan = new Scanner(System.in); //입력문 호출
	
	public static void main(String[] args) { //메인 메소드
		boolean run = true; //실행 스위치
		
		while (run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.입금 | 4.출금 | 5.계좌 해지 | 6.종료");
			System.out.println("------------------------------------------------------------");
			System.out.println("원하시는 메뉴의 번호를 입력하세요 : ");
			String sel = scan.nextLine();
			
			switch (sel) {
			case "1" :
				c_Account(); //계좌생성 함수 호출
				break;
			case "2" :
				account_List();  //계좌목록 함수 호출
				break;
			case "3" :
				deposit(); //입금 함수 호출
				break;
			case "4" :
				withdraw(); //출금 함수 호출
				break;
			case "5" :
				remove_Account(); //계좌해지 함수 호출
				break;
			case "6" :
				System.out.println("[시스템을 종료합니다.]");
				run = false;
				break;
			default :
				System.out.println("[잘못된 입력입니다.]");
			}
		}
	}
	
	private static void c_Account() { //계좌생성 함수
		int e_Account_Index = fe_Account(); //계좌 수 확인 함수 호출
		if (e_Account_Index == -1) {
			System.out.println("[계좌를 더이상 생성할 수 없습니다.]");
		} else {
			System.out.println("[계좌를 생성합니다.]");
			System.out.println("생성할 계좌번호를 입력하세요 : ");
			String accountNo = scan.nextLine();
			System.out.println("예금주를 입력하세요 : ");
			String accountName = scan.nextLine();
			accountArray[e_Account_Index] = new Account(accountNo, accountName, 0);
			System.out.println("[축하합니다, 계좌가 생성되었습니다.]");
		}
	}
	
	private static void account_List() { //계좌목록 함수 호출
		System.out.println("[계좌 목록입니다.]");
		for (int i=0; i<MAX_ACCOUNT; i++) {
			Account account = accountArray[i];
			if (account != null) {
				System.out.printf("%7s%6s%8d\n",account.getAno(), account.getName(), account.getBalance());
			}
		}
	}
	
	private static int fe_Account() { //계좌 수 확인 함수
		for (int i=0; i<MAX_ACCOUNT; i++) { //0부터 1까지 확인(2미만)
			if (accountArray[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	private static void deposit() { //입금 함수
		System.out.println("[입금 시스템 입니다.]");
		System.out.println("계좌번호를 입력하세요 : ");
		String ano = scan.nextLine();
		Account account = find_Account(ano); //계좌 찾기 함수 호출
		if (account == null) {
			System.out.println("[계좌번호를 확인하세요.]");
			return;
		} else {
			System.out.println("입금할 금액을 입력하세요 : ");
			int money = scan.nextInt();
			if (account.i_Balance(money) == SUCCESS) {
				System.out.println("[성공적으로 예금되었습니다.]");
			} else {
				System.out.println("[잔고 한도를 초과합니다.]");
			}
		}
	}
	
	private static void withdraw() { //출금함수
		System.out.println("[출금 시스템 입니다.]");
		System.out.println("계좌번호를 입력하세요 : ");
		String ano = scan.nextLine();
		Account account = find_Account(ano); //계좌 찾기 함수 호출
		if (account == null) {
			System.out.println("[계좌번호를 확인하세요.]");
			return;
		} else {
			System.out.println("출금할 금액을 입력하세요 : ");
			int money = scan.nextInt();
			if (account.d_Balance(money) == SUCCESS) {
				System.out.println("[성공적으로 출금되었습니다.]");
			} else {
				System.out.println("[잔액이 부족합니다.]");
			}
		}
	}
	
	private static void remove_Account( ) {
		System.out.println("[계좌를 해지합니다.]");
		System.out.println("계좌번호를 입력하세요 : ");
		String ano = scan.nextLine();
		int accountIndex = find_Account_Index(ano); //계좌 검색 함수 호출
		if (accountIndex == -1) {
			System.out.println("[계좌번호를 확인하세요.]");
			return;
		} else {
			System.out.println("예금주를 입력하세요. : ");
			String owner = scan.nextLine();
			Account account = accountArray[accountIndex];
			if (account.getName().equals(owner)) {
				accountArray[accountIndex] = null;
				System.out.println("[계좌가 해지되었습니다.]");
			} else {
				System.out.println("[예금주를 확인하세요.]");
			}
			
		}
	}
	
	private static Account find_Account(String ano) { //계좌 찾기 함수
		int account_Index = find_Account_Index(ano);
		if (account_Index == -1) {
			return null;
		} else {
			return accountArray[account_Index];
		}
	}
	
	private static int find_Account_Index(String ano) { //계좌 검색 함수
		for (int i=0; i<MAX_ACCOUNT; i++) {
			if (accountArray[i] != null && ano.equals(accountArray[i].getAno())) {
				return i;
			}
		}
		return -1;
	}
}
