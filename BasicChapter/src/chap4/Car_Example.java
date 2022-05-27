package chap4;

public class Car_Example {

	public static void main1(String[] args) {
		Car car = new Car();
		
		for (int i=1; i<=5; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
				case 1:
					System.out.println("앞:왼쪽 타이어 HankookTire로 교체");
					car.frontLeft = new HankookTire("앞:왼쪽", 15);
					break;
				case 2:
					System.out.println("앞:오른쪽 타이어 kumhoTire로 교체");
					car.frontRight = new KumhoTire("앞:오른쪽", 13);
					break;
				case 3:
					System.out.println("뒤:왼쪽 타이어 HankookTire로 교체");
					car.backLeft = new HankookTire("뒤:왼쪽", 14);
					break;
				case 4:
					System.out.println("뒤:오른쪽 타이어 HankookTire로 교체");
					car.backRight = new KumhoTire("뒤:오른쪽", 17);
					break;
			}
			System.out.println("------------------------------");
		}

	}
}