package chap1;

import java.util.Scanner;

public class while_Example_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
		
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔액조회 | 4. 종료");
			System.out.println("-------------------------------------");
			System.out.println("메뉴의 번호를 선택하세요 : ");
			int num = scanner.nextInt();
			
			switch (num) {
			case 1 :
				System.out.println("입금할 금액을 입력하세요 : ");
				int i_money = scanner.nextInt();
				balance += i_money;
				System.out.printf("[%d원 이 입금 되었습니다.]\n",i_money);
				System.out.printf("[잔액은 %d원 입니다.]",balance);
				System.out.println();
				break;
			case 2 :
				if (balance ==0) {
					System.out.println("[잔액이 부족합니다.]");
					break;
				} else {
					System.out.println("출금할 금액을 입력하세요 : ");
					int o_money = scanner.nextInt();
					if (o_money <= balance) {
						balance -= o_money;
						System.out.printf("[%d원 이 출금 되었습니다.]\n",o_money);
						System.out.printf("[잔액은 %d원 입니다.]",balance);
						System.out.println();
					} else {
						System.out.println("[잔액이 부족합니다.]");
					} break;
				}
			case 3 :
				System.out.printf("[잔액은 %d원 입니다.]",balance);
				System.out.println();
				break;
			case 4 :
				System.out.println("[시스템을 종료합니다.]");
				run = false;
				break;
			default :
				System.out.println("[올바른 입력이 아닙니다.]");
			}
		}
	}
}