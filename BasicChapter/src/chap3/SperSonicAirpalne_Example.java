package chap3;

public class SperSonicAirpalne_Example {

	public static void main(String[] args) {
		SuperSonicAirplane ssa = new SuperSonicAirplane();
		ssa.takeOff();
		ssa.fly();
		ssa.flyMode = ssa.SUPERSONIC;
		ssa.fly();
		ssa.flyMode = ssa.NOMAL;
		ssa.fly();
		ssa.land();
	}

}
