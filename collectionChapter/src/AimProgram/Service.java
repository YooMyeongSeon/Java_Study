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
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			System.out.println("==============================");
			System.out.println("원하는 메뉴의 번호를 입력하세요 : ");
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
				System.out.println("올바른 입력이 아닙니다.");
			}
		} while (run);
	}
	
	public void signUp() {
		System.out.println("회원가입 메뉴를 선택했습니다.");
		boolean Typerun = true;
		boolean userType = false;
		do {
			System.out.println("가입 유형을 선택하세요.");
			System.out.println("==============================");
			System.out.println("1. 교사");
			System.out.println("2. 학생");
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
				System.out.println("올바른 입력이 아닙니다.");
			}
		} while (Typerun);
		System.out.println("이름을 입력하세요 : ");
		String userName = scan.nextLine();
		String userId;
		while (true) {
			boolean overlap = false;
			System.out.println("사용하실 아이디를 입력하세요(중복불가) : ");
			userId = scan.nextLine();
			if (Main.memberlist != null) {
				for (int i=0; i<Main.memberlist.size(); i++) {
					if (Main.memberlist.get(i).id.equals(userId)) {
						System.out.println("입력하신 아이디가 존재합니다.");
						overlap = true;
						break;
					}
				}
			}
			if (overlap == false) {
				break;
			}
		}
		System.out.println("사용하실 비밀번호를 입력하세요 : ");
		String userPw = scan.nextLine();
		System.out.println("비밀번호를 다시 한 번 입력하세요 : ");
		String userPwCheck = scan.nextLine();
		while (true) {
			if (userPw.equals(userPwCheck)) {
				System.out.println("입력하신 비밀번호가 일치합니다.");
				break;
			} else {
				System.out.println("입력하신 비밀번호가 일치하지 않습니다!");
				System.out.println("사용하실 비밀번호를 입력하세요 : ");
				userPw = scan.nextLine();
				System.out.println("비밀번호를 다시 한 번 입력하세요 : ");
				userPwCheck = scan.nextLine();
			}
		}
		String usersSubject = null;
		String usersMajor = null;
		if (userType == true) {
			System.out.println("담당 과목을 입력해주세요. : ");
			usersSubject  = scan.nextLine();
		} else {
			System.out.println("전공을 입력해주세요. : ");
			usersMajor  = scan.nextLine();
		}
		System.out.println("회원가입을 축하합니다!");
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
		System.out.println("종료하시겠습니까?(Y/N) : ");
		String answer = scan.nextLine();
		if (answer.equals("Y")  || answer.equals("y")) {
			System.out.println("프로그램을 종료합니다.");
			return false;
		} else if (answer.equals("N") || answer.equals("n")) {
			return true;
		} else {
			System.out.println("올바른 입력이 아닙니다.");
			return true;
		}
	}
}