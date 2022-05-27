package chap2;

public class Dmb_CellPhone extends CellPhone {

	int channel;
	
	Dmb_CellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;}
	
	void turnOnDmb() {System.out.println("채널" + channel + "번 방송을 수신합니다.");}	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번 방송으로 변경합니다.");}
	void turnOffDmb() {System.out.println("방송 수신을 종료합니다.");}
}