package chap1;

public class ifEaxmple {

	public static void main(String[] args) {
//		int score = 93;
//		
//		if (score>=90) {
//			System.out.println("������ 90������ �����ϴ�.");
//			System.out.println("����� A��� �Դϴ�.");
//		}
//		if (score<90) {
//			System.out.println("������ 90������ �����ϴ�.");
//			System.out.println("����� B��� �Դϴ�.");
		
//		int score = 85;
//		if (score>=90) {
//			System.out.println("������ 90������ �����ϴ�.");
//			System.out.println("����� A��� �Դϴ�.");
//		} else {
//			System.out.println("������ 90������ �����ϴ�.");
//			System.out.println("����� B��� �Դϴ�.");
//		}
		
		int score = 75;
		
		if (score>=90) {
			System.out.println("������ 90 ~ 100�� �Դϴ�.");
			System.out.println("����� A��� �Դϴ�.");
		} else if (score>=80) {
			System.out.println("������ 80 ~ 89�� �Դϴ�.");
			System.out.println("����� B��� �Դϴ�.");
		} else if (score>=80) {
			System.out.println("������ 70 ~ 79�� �Դϴ�.");
			System.out.println("����� C��� �Դϴ�.");
		} else if (score>=80) {
			System.out.println("������ 60 ~ 69�� �Դϴ�.");
			System.out.println("����� D��� �Դϴ�.");
		} else {
			System.out.println("������ 0 ~ 59�� �Դϴ�.");
			System.out.println("����� F��� �Դϴ�.");
		}
	}
}
