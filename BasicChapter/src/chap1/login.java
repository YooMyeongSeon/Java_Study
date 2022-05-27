package chap1;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.println("아이디를 입력하세요");
		String userId = input.nextLine();
		
		System.out.println("비밀번호를 입력하세요");
		String userPw = input.nextLine();
		int intUserPw = Integer.parseInt(userPw);
		
		if ((userId.equals("java")) & (12345 == intUserPw)) {
			System.out.println("로그인에 성공 하였습니다.");
		}
		else if (userId != "java") {
			System.out.println("아이디가 일치하지 않습니다.");
		}
		else {
			System.out.println("패스워드가 일치하지 않습니다.");
		}
	}
}
