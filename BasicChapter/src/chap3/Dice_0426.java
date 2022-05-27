package chap3;

public class Dice_0426 {

	public static void main(String[] args) {
		System.out.println("주사위 게임을 시작합니다!");
		
		int dice = (int)(Math.random()*6)+1;
		
		System.out.println("주사위 숫자는 "+dice+"입니다!");
		
		if (dice==6) {
			System.out.println("1등입니다! 벌금은 없습니다!");
		} else if (dice==5) {
			System.out.println("2등입니다! 벌금은 없습니다!");
		} else if (dice==4) {
			System.out.println("3등입니다! 벌금은 만원 입니다!");
		} else if (dice==3) {
			System.out.println("4등입니다! 벌금은 만원 입니다!");
		} else if (dice==2) {
			System.out.println("5등입니다! 벌금은 2만원 입니다!");
		} else {
			System.out.println("꼴등입니다! 벌금은 2만원 입니다!");
		}
	}

}
