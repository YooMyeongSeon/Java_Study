package chap2;

public class Car3_Example {

	public static void main(String[] args) {
		Car3 myCar = new Car3();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		//올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재속도 : " + myCar.getSpeed());
		
		//멈춤
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재속도 : " + myCar.getSpeed());
	}

}
