package chap1;

public class time {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		int year = 2022;
		int month = 4;
		int day = 25;
		String week = "������";
		
		System.out.println(hour+"�� "+minute+"�� ");
		
		int totalminute = (hour*60) + minute;
		System.out.println("�� �ð��� "+totalminute+"�� �Դϴ�.");
		
		System.out.println("������ "+year+"�� "+month+"�� "+day+"�� �Դϴ�. ������ ������ "+week+"�Դϴ�.");
	}
}