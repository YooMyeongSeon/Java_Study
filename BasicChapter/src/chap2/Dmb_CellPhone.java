package chap2;

public class Dmb_CellPhone extends CellPhone {

	int channel;
	
	Dmb_CellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;}
	
	void turnOnDmb() {System.out.println("ä��" + channel + "�� ����� �����մϴ�.");}	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��" + channel + "�� ������� �����մϴ�.");}
	void turnOffDmb() {System.out.println("��� ������ �����մϴ�.");}
}