package chap4;

public class Car_Example {

	public static void main1(String[] args) {
		Car car = new Car();
		
		for (int i=1; i<=5; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
				case 1:
					System.out.println("��:���� Ÿ�̾� HankookTire�� ��ü");
					car.frontLeft = new HankookTire("��:����", 15);
					break;
				case 2:
					System.out.println("��:������ Ÿ�̾� kumhoTire�� ��ü");
					car.frontRight = new KumhoTire("��:������", 13);
					break;
				case 3:
					System.out.println("��:���� Ÿ�̾� HankookTire�� ��ü");
					car.backLeft = new HankookTire("��:����", 14);
					break;
				case 4:
					System.out.println("��:������ Ÿ�̾� HankookTire�� ��ü");
					car.backRight = new KumhoTire("��:������", 17);
					break;
			}
			System.out.println("------------------------------");
		}

	}
}