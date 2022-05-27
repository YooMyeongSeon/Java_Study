package chap1;

import java.util.Scanner;

public class score_Quiz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int score = scanner.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("입력된 점수는 "+score+"입니다.");
			System.out.println("학점은 A학점 입니다.");
			break;
		case 8:
			System.out.println("입력된 점수는 "+score+"입니다.");
			System.out.println("학점은 B학점 입니다.");
			break;
		case 7:
			System.out.println("입력된 점수는 "+score+"입니다.");
			System.out.println("학점은 C학점 입니다.");
			break;
		case 6:
			System.out.println("입력된 점수는 "+score+"입니다.");
			System.out.println("학점은 D학점 입니다.");
			break;
		default :
			System.out.println("입력된 점수는 "+score+"입니다.");
			System.out.println("학점은 F학점 입니다.");
			break;
		}
	}
}