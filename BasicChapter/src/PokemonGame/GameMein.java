package PokemonGame;

import java.util.Scanner;

public class GameMein {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pokemon pokemon = null;
		PalyGame pg = null;
		System.out.println("���ϴ� ���ϸ��� �����ϼ���!");
		System.out.println("1. ��ī�� | 2. ���α� | 3.�̻��ؾ�");
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
			System.out.println("�߸��� �����Դϴ�.");
		}
		
		if (pokemon == null) {
			System.out.println("������ �����մϴ�.");
			return;
		} else {
			pg = new PalyGame(pokemon);
		}
		while (true) {
			pg.printMenu(sc);
			
			if (pg.isExit()) {
				System.out.println("������ �����մϴ�.");
				break;
			}
		}
	}
}
