package chap3;

class Airplane_1 {
	public void land() {
		System.out.println("�����մϴ�.");
	}
	public void fly() {
		System.out.println("�Ϲ� �����մϴ�.");
	}
	public void takeOff() {
		System.out.println("�̷��մϴ�.");
	}
}

class SuperSonicAirplane_1 extends Airplane_1 {
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


public class SperSonicAirplane_Example_All {

	public static void main(String[] args) {
		SuperSonicAirplane_1 ssa = new SuperSonicAirplane_1();
		ssa.takeOff();
		ssa.fly();
		ssa.flyMode = SuperSonicAirplane_1.SUPERSONIC;
		ssa.fly();
		ssa.flyMode = SuperSonicAirplane_1.NOMAL;
		ssa.fly();
		ssa.land();
	}
}