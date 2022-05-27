package chap3;

public class Computer extends Calculator{
	@Override // 메소드 오버라이딩 어노테이션 : 생략해도 되지만, @Override를 입력하면 오버라이딩 간에 오타로 인한 컴파일 에러를 잡는다.
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI * r * r;
	}
}
