package chap4;

public class Car {
	//Tire
	Tire frontLeft = new Tire("��:����", 6);
	Tire frontRight = new Tire("��:������", 2);
	Tire backLeft = new Tire("��:����", 3);
	Tire backRight = new Tire("��:������", 4);
	
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if (frontLeft.roll() == false) {stop(); return 1;}
		if (frontRight.roll() == false) {stop(); return 2;}
		if (backLeft.roll() == false) {stop(); return 3;}
		if (backRight.roll() == false) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
