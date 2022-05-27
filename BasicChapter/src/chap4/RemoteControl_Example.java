package chap4;

public class RemoteControl_Example {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
	}

}
