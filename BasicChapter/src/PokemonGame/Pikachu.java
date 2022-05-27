package PokemonGame;

public class Pikachu extends Pokemon {
	public Pikachu() {
		hp = 30;
		energy = 50;
		System.out.println("피카츄를 잡았습니다!");
		printInfo();
	}
	
	@Override
	public void eat() {
		energy += 10;
	}
	
	@Override
	public void sleep() {
		energy += 5;
	}
	
	@Override
	public boolean play() {
		energy -= 20;
		hp += 5;
		levelup();
		return checkEnergy();
	}
	
	@Override
	public boolean train() {
		energy -= 15;
		hp += 20;
		levelup();
		return checkEnergy();
	}
	
	@Override
	public void levelup() {
		if (40 <= hp) {
			level++;
			hp -= 40;
		}
	}
}