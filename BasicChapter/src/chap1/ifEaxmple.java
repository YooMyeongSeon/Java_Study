package chap1;

public class ifEaxmple {

	public static void main(String[] args) {
//		int score = 93;
//		
//		if (score>=90) {
//			System.out.println("점수가 90점보다 높습니다.");
//			System.out.println("등급은 A등급 입니다.");
//		}
//		if (score<90) {
//			System.out.println("점수가 90점보다 낮습니다.");
//			System.out.println("등급은 B등급 입니다.");
		
//		int score = 85;
//		if (score>=90) {
//			System.out.println("점수가 90점보다 높습니다.");
//			System.out.println("등급은 A등급 입니다.");
//		} else {
//			System.out.println("점수가 90점보다 낮습니다.");
//			System.out.println("등급은 B등급 입니다.");
//		}
		
		int score = 75;
		
		if (score>=90) {
			System.out.println("점수가 90 ~ 100점 입니다.");
			System.out.println("등급은 A등급 입니다.");
		} else if (score>=80) {
			System.out.println("점수가 80 ~ 89점 입니다.");
			System.out.println("등급은 B등급 입니다.");
		} else if (score>=80) {
			System.out.println("점수가 70 ~ 79점 입니다.");
			System.out.println("등급은 C등급 입니다.");
		} else if (score>=80) {
			System.out.println("점수가 60 ~ 69점 입니다.");
			System.out.println("등급은 D등급 입니다.");
		} else {
			System.out.println("점수가 0 ~ 59점 입니다.");
			System.out.println("등급은 F등급 입니다.");
		}
	}
}
