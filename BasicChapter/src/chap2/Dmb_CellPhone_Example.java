package chap2;

public class Dmb_CellPhone_Example {

	public static void main(String[] args) {
		Dmb_CellPhone dmbCellPhone = new Dmb_CellPhone("������", "ȭ��Ʈ", 10);
		
		System.out.println("�� : "+dmbCellPhone.model);
		System.out.println("���� : "+dmbCellPhone.color);
		System.out.println("ä�� : "+dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������?");
		dmbCellPhone.receiveVoice("��������?");
		dmbCellPhone.sendVoice("ȫ�浿�Դϴ�.");
		dmbCellPhone.sendVoice("������ Ű�켼��?");
		dmbCellPhone.receiveVoice("�ƴ�?");
		dmbCellPhone.sendVoice("�׷���");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}