package chap1;

public class ifExample_2 {

	public static void main(String[] args) {

		System.out.println("�ֻ��� ������ �����մϴ�!");
		
		int num = (int)(Math.random()*6)+1;
		
		System.out.println("�ֻ��� ���ڴ� "+num+"�Դϴ�!");
		
		if (num==6) {
			System.out.println("1���Դϴ�! ������ �����ϴ�!");
		} else if (num==5) {
			System.out.println("2���Դϴ�! ������ �����ϴ�!");
		} else if (num==4) {
			System.out.println("3���Դϴ�! ������ ���� �Դϴ�!");
		} else if (num==3) {
			System.out.println("4���Դϴ�! ������ ���� �Դϴ�!");
		} else if (num==2) {
			System.out.println("5���Դϴ�! ������ 2���� �Դϴ�!");
		} else {
			System.out.println("�õ��Դϴ�! ������ 2���� �Դϴ�!");
		}
	}
}
