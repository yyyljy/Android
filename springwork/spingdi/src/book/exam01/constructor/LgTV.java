package book.exam01.constructor;

public class LgTV implements TVInterface{
	Speaker speak;
	public LgTV(Speaker speak) {
		super();
		this.speak = speak;
	}
	public void powerOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}

	public void powerOff() {
		System.out.println("LgTV---���� ����.");
	}

	public void volumeUp() {
		speak.volumeUp();
		System.out.println("LgTV---�Ҹ� �ø���.");
	}

	public void volumeDown() {
		speak.volumeDown();
		System.out.println("LgTV---�Ҹ� ������.");
	}
}
