package chap1;

public class ifExample_2 {

	public static void main(String[] args) {

		System.out.println("주사위 게임을 시작합니다!");
		
		int num = (int)(Math.random()*6)+1;
		
		System.out.println("주사위 숫자는 "+num+"입니다!");
		
		if (num==6) {
			System.out.println("1등입니다! 벌금은 없습니다!");
		} else if (num==5) {
			System.out.println("2등입니다! 벌금은 없습니다!");
		} else if (num==4) {
			System.out.println("3등입니다! 벌금은 만원 입니다!");
		} else if (num==3) {
			System.out.println("4등입니다! 벌금은 만원 입니다!");
		} else if (num==2) {
			System.out.println("5등입니다! 벌금은 2만원 입니다!");
		} else {
			System.out.println("꼴등입니다! 벌금은 2만원 입니다!");
		}
	}
}
