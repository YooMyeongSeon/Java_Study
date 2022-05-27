package chap3;

public class Ovr_1 {

	public static void main(String[] args) {
		Ovr_1 a1 = new Ovr_1();
		Ovr_2 a2 = new Ovr_2();
		
		System.out.println(a1.sun(3, 2) + a2.sun(3, 2));
	}
	int sun(int x, int y) {
		return x + y;
	}
	}
class Ovr_2 extends Ovr_1 {
	int sun(int x, int y) {
		return x - y + super.sun(x, y);
	}
	
}
