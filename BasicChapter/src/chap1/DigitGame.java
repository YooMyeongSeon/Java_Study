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
		
		System.out.println("��ǻ�Ͱ� ���� ���ڸ� ����Ͽ����ϴ�.");
		System.out.println("���� 0���� 50������ ���ڸ� ���纸����");
		
		while(true) {
			System.out.println("���ڸ� ���纸���� : ");
			b = userNum.nextInt();
			if (b == a) {
				if (c == 1) {
					System.out.printf("�����Դϴ�! ����� õ���Դϴ�!");
				} else {
					System.out.printf("�����Դϴ�! �� �ݺ�Ƚ���� %dȸ�Դϴ�!", c);
				}
				break;
			} else if (b > 50) {
				System.out.println("0���� 50������ ���ڸ� �Է��ϼ���.");
			} else if (b < 0) {
				System.out.println("0���� 50������ ���ڸ� �Է��ϼ���.");
			} else if (b > a) {
				System.out.printf("���ڰ� ������ Ů�ϴ�.\n");
				c += 1;
				continue;
			} else {
				System.out.printf("���ڰ� ������ �۽��ϴ�.\n");
				c += 1;
				continue;
			}
		}
		
	}

}
