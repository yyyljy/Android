package book.exam.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("samsung")
public class SamsungTV implements TV{
	//���� Ŭ���� ���ο��� ����ϴ� ��ü - �����������̳ʸ� ���� ���޹��� �� �ֵ��� �غ�
	@Autowired
	@Qualifier("sony")
	Speaker speaker;
	public SamsungTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}
	public SamsungTV() {
		
	}
	public void turnOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void soundUp() {
		System.out.println("SamsungTV---�Ҹ� �ø���.");
		speaker.soundUp();
	}

	public void soundDown() {
		System.out.println("SamsungTV---�Ҹ� ������.");
		speaker.soundDown();
	}
}
