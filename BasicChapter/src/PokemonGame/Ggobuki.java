package PokemonGame;

public class Ggobuki extends Pokemon{
	public Ggobuki() {
		hp = 40;
		energy = 50;
		System.out.println("꼬부기를 잡았습니다!");
		printInfo();
	}
	
	@Override
	public void eat() {
		energy += 15;
	}
	
	@Override
	public void sleep() {
		energy += 10;
	}
	
	@Override
	public boolean play() {
		energy -= 30;
		hp += 15;
		levelup();
		return checkEnergy();
	}
	
	@Override
	public boolean train() {
		energy -= 20;
		hp += 30;
		levelup();
		return checkEnergy();
	}
	
	@Override
	public void levelup() {
		if (50 <= hp) {
			level++;
			hp -= 50;
		}
	}
}