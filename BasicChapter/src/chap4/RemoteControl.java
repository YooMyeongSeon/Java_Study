package chap4;

public interface RemoteControl { //�������̽�, ��ü ��� ����
	//���
	public int MAX_VOLUME = 10; //�빮�ڷ� ���鼭, static final�� ���� �����ϴ�.
	public int MIN_VOLUME = 0;
	//�߻� �޼ҵ�
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}
