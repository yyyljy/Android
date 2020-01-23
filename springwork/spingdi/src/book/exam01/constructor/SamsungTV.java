package book.exam01.constructor;

public class SamsungTV implements TVInterface{
	Speaker speak;
	public SamsungTV(Speaker speak) {
		super();
		this.speak = speak;
	}

	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void volumeUp() {
		speak.volumeUp();
		System.out.println("SamsungTV---�Ҹ� �ø���.");
	}

	public void volumeDown() {
		speak.volumeDown();
		System.out.println("SamsungTV---�Ҹ� ������.");
	}
}
