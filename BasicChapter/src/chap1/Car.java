package chap1;

public class Car {
	String model;
	int speed; //2������ �ʵ�
	
	// Car(){} //����Ʈ ������, ������ �����ϴ�.
	Car(String model){
		this.model = model; //���� model�� �ʵ�, ���� model�� �Ű������̴�, ������ ������ this�� ����Ѵ�.
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void run() {
		for (int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �������Դϴ�.(�ü� : "+this.speed+"km/h5)");
		}
	}
}