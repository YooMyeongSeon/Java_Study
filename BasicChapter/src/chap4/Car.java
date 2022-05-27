package chap4;

public class Car {
	//Tire
	Tire frontLeft = new Tire("앞:왼쪽", 6);
	Tire frontRight = new Tire("앞:오른쪽", 2);
	Tire backLeft = new Tire("뒤:왼쪽", 3);
	Tire backRight = new Tire("뒤:오룬쪽", 4);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (frontLeft.roll() == false) {stop(); return 1;}
		if (frontRight.roll() == false) {stop(); return 2;}
		if (backLeft.roll() == false) {stop(); return 3;}
		if (backRight.roll() == false) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
