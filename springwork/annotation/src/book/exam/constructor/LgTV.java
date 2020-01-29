package book.exam.constructor;

public class LgTV implements TV{
	Speaker speaker;
	public LgTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}
	public void turnOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("LgTV---���� ����.");
	}

	public void soundUp() {
		System.out.println("LgTV---�Ҹ� �ø���.");
		speaker.soundUp();
	}

	public void soundDown() {
		System.out.println("LgTV---�Ҹ� ������.");
		speaker.soundDown();
	}
}
