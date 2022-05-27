package PokemonGame;

import java.util.Scanner;

public class GameMein {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pokemon pokemon = null;
		PalyGame pg = null;
		System.out.println("원하는 포켓몬을 선택하세요!");
		System.out.println("1. 피카츄 | 2. 꼬부기 | 3.이상해씨");
		int x = sc.nextInt();
		
		switch (x) {
		case 1 :
			pokemon = new Pikachu();
			break;
		case 2 :
			pokemon = new Ggobuki();
			break;
		case 3 :
			pokemon = new Isanghaessi();
			break;
		default :
			System.out.println("잘못된 선택입니다.");
		}
		
		if (pokemon == null) {
			System.out.println("게임을 종료합니다.");
			return;
		} else {
			pg = new PalyGame(pokemon);
		}
		while (true) {
			pg.printMenu(sc);
			
			if (pg.isExit()) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
	}
}
