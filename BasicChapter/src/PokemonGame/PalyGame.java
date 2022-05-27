package PokemonGame;

import java.util.Scanner;

public class PalyGame {
	private Pokemon pokemon;
	private int menu;
	private boolean exit;
	
	public PalyGame(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public void printMenu(Scanner sc) {
		System.out.println("----------------------------------------");
		System.out.println("1.��Ա� | 2.���ڱ� | 3.��� | 4.� | 5.����");
		System.out.println("----------------------------------------");
		menu = sc.nextInt();
		play();
	}
	
	public void play() {
		switch (menu) {
		case 1 :
			pokemon.eat();
			break;
		case 2 :
			pokemon.sleep();
			break;
		case 3 :
			exit = pokemon.play();
			break;
		case 4 :
			exit = pokemon.train();
			break;
		case 5 :
			exit = true;
		}
		pokemon.printInfo();
	}
	
	public Pokemon getPokemon() {
		return pokemon;
	}
	
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public int getMenu() {
		return menu;
	}
	
	public void setMenu(int menu) {
		this.menu = menu;
	}
	
	public boolean isExit() {
		return exit;
	}
	
	public void setExit(boolean exit) {
		this.exit = exit;
	}
}	
