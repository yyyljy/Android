package book.exam01.constructor;

public class SonySpeaker implements Speaker{
	public SonySpeaker() {
		System.out.println("SonySpeaker��ü ����");
	}
	public void volumeUp() {
		System.out.println("SonySpeaker�� ������!!!");
	}
	public void volumeDown() {
		System.out.println("SonySpeaker�� �����ٿ�~~~");
	}
}
