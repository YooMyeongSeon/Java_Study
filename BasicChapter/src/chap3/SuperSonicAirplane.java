package chap3;

public class SuperSonicAirplane extends Airplane {
	public final static int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NOMAL;
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("������ �����մϴ�.");
		} else {
			super.fly();
		}
	}
}
