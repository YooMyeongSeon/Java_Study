package chap2;

public class Car3_Example {

	public static void main(String[] args) {
		Car3 myCar = new Car3();
		
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		System.out.println("����ӵ� : " + myCar.getSpeed());
		
		//����
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("����ӵ� : " + myCar.getSpeed());
	}

}
