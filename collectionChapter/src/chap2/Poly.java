package chap2;

public class Poly {
	//다형성 : 타입
	
	int a = 0; //타입, 변수, 데이터순
	
	// ClassA b = new ClassB();
	// 변수 b에는 ClassA 타입이 알고있는 형태의 데이터라고 판단(메서드, 필드등을 가진)
	// 둘은 상속관계이다.
	
	Car c = new Suv();
}
