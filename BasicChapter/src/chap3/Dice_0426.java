package chap3;

public class Dice_0426 {

	public static void main(String[] args) {
		System.out.println("�ֻ��� ������ �����մϴ�!");
		
		int dice = (int)(Math.random()*6)+1;
		
		System.out.println("�ֻ��� ���ڴ� "+dice+"�Դϴ�!");
		
		if (dice==6) {
			System.out.println("1���Դϴ�! ������ �����ϴ�!");
		} else if (dice==5) {
			System.out.println("2���Դϴ�! ������ �����ϴ�!");
		} else if (dice==4) {
			System.out.println("3���Դϴ�! ������ ���� �Դϴ�!");
		} else if (dice==3) {
			System.out.println("4���Դϴ�! ������ ���� �Դϴ�!");
		} else if (dice==2) {
			System.out.println("5���Դϴ�! ������ 2���� �Դϴ�!");
		} else {
			System.out.println("�õ��Դϴ�! ������ 2���� �Դϴ�!");
		}
	}

}
