package chap4;

public interface RemoteControl { //인터페이스, 객체 사용 설명서
	//상수
	public int MAX_VOLUME = 10; //대문자로 쓰면서, static final을 생략 가능하다.
	public int MIN_VOLUME = 0;
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}
