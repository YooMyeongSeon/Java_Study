package chap2;

public class CellPhone {
	String model;
	String color;
	
	void powerOn() {System.out.println("������ �������ϴ�.");}
	void powerOff() {System.out.println("������ �������ϴ�.");}
	void bell() {System.out.println("���� �︳�ϴ�.");}
	void sendVoice(String message) {System.out.println("ȫ�浿 : "+message);}
	void receiveVoice(String message) {System.out.println("���� : "+message);}
	void hangUp() {System.out.println("��ȭ�� ������ϴ�.");}
}