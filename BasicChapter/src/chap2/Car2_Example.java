package chap2;

public class Car2_Example {

	public static void main(String[] args) {
		Car2 car1 = new Car2();
		System.out.println("������ : "+car1.company);
		System.out.println();
		
		Car2 car2 = new Car2("�ƹݶ�");
		System.out.println("������ : "+car2.company);
		System.out.println("�� : "+car2.model);
		System.out.println();
		
		Car2 car3 = new Car2("�ƹݶ�","���");
		System.out.println("������ : "+car3.company);
		System.out.println("�� : "+car3.model);
		System.out.println("���� : "+car3.color);
		System.out.println();
		
		Car2 car4 = new Car2("�ƹݶ�","���", 300);
		System.out.println("������ : "+car4.company);
		System.out.println("�� : "+car4.model);
		System.out.println("���� : "+car4.color);
		System.out.println("�ְ�ӷ� : "+car4.maxSpeed+"km/h");
		System.out.println();
	}
}
