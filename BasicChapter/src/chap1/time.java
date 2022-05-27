package chap1;

public class time {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		int year = 2022;
		int month = 4;
		int day = 25;
		String week = "월요일";
		
		System.out.println(hour+"시 "+minute+"분 ");
		
		int totalminute = (hour*60) + minute;
		System.out.println("총 시간은 "+totalminute+"분 입니다.");
		
		System.out.println("오늘은 "+year+"년 "+month+"월 "+day+"일 입니다. 오늘의 요일은 "+week+"입니다.");
	}
}