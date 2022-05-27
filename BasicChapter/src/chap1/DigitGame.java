package chap1;

import java.util.Random;
import java.util.Scanner;

public class DigitGame {

	public static void main(String[] args) {
		Scanner userNum = new Scanner(System.in);
		Random comNum = new Random();
		
		int a, b, c;
		a = comNum.nextInt(51);
		c = 1;
		
		System.out.println("컴퓨터가 랜덤 숫자를 기억하였습니다.");
		System.out.println("이제 0부터 50사이의 숫자를 맞춰보세요");
		
		while(true) {
			System.out.println("숫자를 맞춰보세요 : ");
			b = userNum.nextInt();
			if (b == a) {
				if (c == 1) {
					System.out.printf("정답입니다! 당신은 천재입니다!");
				} else {
					System.out.printf("정답입니다! 총 반복횟수는 %d회입니다!", c);
				}
				break;
			} else if (b > 50) {
				System.out.println("0부터 50이하의 숫자를 입력하세요.");
			} else if (b < 0) {
				System.out.println("0부터 50이하의 숫자를 입력하세요.");
			} else if (b > a) {
				System.out.printf("숫자가 값보다 큽니다.\n");
				c += 1;
				continue;
			} else {
				System.out.printf("숫자가 값보다 작습니다.\n");
				c += 1;
				continue;
			}
		}
		
	}

}
