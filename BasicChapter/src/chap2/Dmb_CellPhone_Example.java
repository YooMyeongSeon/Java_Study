package chap2;

public class Dmb_CellPhone_Example {

	public static void main(String[] args) {
		Dmb_CellPhone dmbCellPhone = new Dmb_CellPhone("갤럭시", "화이트", 10);
		
		System.out.println("모델 : "+dmbCellPhone.model);
		System.out.println("색상 : "+dmbCellPhone.color);
		System.out.println("채널 : "+dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요?");
		dmbCellPhone.receiveVoice("누구세요?");
		dmbCellPhone.sendVoice("홍길동입니다.");
		dmbCellPhone.sendVoice("강아지 키우세요?");
		dmbCellPhone.receiveVoice("아뇨?");
		dmbCellPhone.sendVoice("그럼즐");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}