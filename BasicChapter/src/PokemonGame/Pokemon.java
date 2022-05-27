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
		System.out.println("-----���ϸ��� ����-----");
		System.out.println("ü�� : "+hp);
		System.out.println("������ :"+energy);
		System.out.println("���� : "+level);
	}
}
