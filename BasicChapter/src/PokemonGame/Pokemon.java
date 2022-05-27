package PokemonGame;

public abstract class Pokemon {
	protected int hp;
	protected int level = 0;
	protected int energy;
	
	public abstract void eat();
	
	public abstract void sleep();
	
	public abstract boolean play();
	
	public abstract boolean train();
	
	public abstract void levelup();
	
	public boolean checkEnergy() {
		if (energy <= 0) {
			return true;
		} else {
			return false;
		}
	}
	public void printInfo() {
		System.out.println("-----포켓몬의 정보-----");
		System.out.println("체력 : "+hp);
		System.out.println("에너지 :"+energy);
		System.out.println("레벨 : "+level);
	}
}
