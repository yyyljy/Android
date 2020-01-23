package book.exam.constructor;

import org.springframework.stereotype.Service;

@Service("sony")
public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("SonySpeaker��ü����");
	}
	public void soundUp() {
		System.out.println("SonySpeaker�� ������~~~~");
	}
	public void soundDown() {
		System.out.println("SonySpeaker�� �����ٿ�~~~~");
	}
}
