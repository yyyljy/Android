package exam01;

public class SamsungTV implements TVInterface{
	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void volumeUp() {
		System.out.println("SamsungTV---�Ҹ� �ø���.");
	}

	public void volumeDown() {
		System.out.println("SamsungTV---�Ҹ� ������.");
	}
}
