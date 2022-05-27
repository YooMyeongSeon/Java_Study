package chap1;

public class Car {
	String model;
	int speed; //2가지의 필드
	
	// Car(){} //디폴트 생성자, 생략이 가능하다.
	Car(String model){
		this.model = model; //앞의 model은 필드, 뒤의 model은 매개변수이다, 같으면 구분자 this를 사용한다.
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void run() {
		for (int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 주행중입니다.(시속 : "+this.speed+"km/h5)");
		}
	}
}