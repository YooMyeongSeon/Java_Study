package chap2;

public class CellPhone {
	String model;
	String color;
	
	void powerOn() {System.out.println("전원이 켜졌습니다.");}
	void powerOff() {System.out.println("전원이 꺼졌습니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String message) {System.out.println("홍길동 : "+message);}
	void receiveVoice(String message) {System.out.println("상대방 : "+message);}
	void hangUp() {System.out.println("전화가 끊겼습니다.");}
}
