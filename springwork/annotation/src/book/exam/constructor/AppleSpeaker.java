package book.exam.constructor;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("AppleSpeaker��ü����");
	}
	public void soundUp() {
		System.out.println("AppleSpeaker�� ������~~~~");
	}
	public void soundDown() {
		System.out.println("AppleSpeaker�� �����ٿ�~~~~");
	}
}
