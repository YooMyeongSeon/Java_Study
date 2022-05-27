package chap1;

public class switchExample {

	public static void main(String[] args) {
		//8시 = 출근합니다
		//9시 = 회의를 시작합니다.
		//10시 = 업무를 보고 있습니다.
		//그 외 시간 = 외근을 나갑니다.
		//time 변수에 랜덤수를 저장, switch와 case를 이용
		//현재시각 표시
		
//		int num = (int)(Math.random()*6)+1;
//		
//		switch(num) {
//		case 1:
//			System.out.println("1번이 나왔습니다.");
//			break;
//		case 2:
//			System.out.println("2번이 나왔습니다.");
//			break;
//		case 3:
//			System.out.println("3번이 나왔습니다.");
//			break;
//		case 4:
//			System.out.println("4번이 나왔습니다.");
//			break;
//		case 5:
//			System.out.println("5번이 나왔습니다.");
//			break;
//		default :
//			System.out.println("6번이 나왔습니다.");
//			break;
//		}
		
		int time = (int)(Math.random()*4)+8;
		
		System.out.println("현재 시간은 "+time+"시 입니다.");
		
		switch(time) {
		case 8:
			System.out.println("출근을 했습니다.");
			break;
		case 9:
			System.out.println("회의를 시작합니다.");
			break;
		case 10:
			System.out.println("업무를 시작합니다.");
			break;
		default :
			System.out.println("외근 중입니다.");
			break;
		}
	}

}
