package chap4;

public class Audio implements RemoteControl {
	private int volume;
	
	public void turnOn() {
		System.out.println("오디오가 켜졌습니다.");
	}
	
	public void turnOff() {
		System.out.println("오디오가 꺼졌습니다.");
	}
	
	public void setVolume(int volume) {
		if (volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume>RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오다오의 볼륨 : "+this.volume);
	}
}