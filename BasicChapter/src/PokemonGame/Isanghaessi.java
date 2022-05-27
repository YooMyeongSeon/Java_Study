package PokemonGame;

public class Isanghaessi extends Pokemon{
	public Isanghaessi() {
		hp = 20;
		energy = 30;
		System.out.println("이상해씨를 잡았습니다!");
		printInfo();
	}
	
	@Override
	public void eat() {
		energy += 5;
	}
	
	@Override
	public void sleep() {
		energy += 20;
	}
	
	@Override
	public boolean play() {
		energy -= 10;
		hp += 15;
		levelup();
		return checkEnergy();
	}
	
	@Override
	public boolean train() {
		energy -= 10;
		hp += 20;
		levelup();
		return checkEnergy();
	}
	
	@Override
	public void levelup() {
		if (35 <= hp) {
			level++;
			hp -= 35;
		}
	}
}