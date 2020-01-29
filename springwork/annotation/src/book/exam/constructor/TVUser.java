package book.exam.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 * �����������̳ʿ� ���� �����ؼ� ��ü�� ���� �޾� ����� �� �ֵ��� �����ϱ�
		 * Dependency Lookup����
		 * ��������:config/bean.xml
		 * �� ��� :
		 *     SamsungTV => samsung
		 *     LgTV => lg
		 *     
		 * getBean���� ���ͼ� �۾��ϵ��� �ڵ� �����ϱ�    
		 */
		AbstractApplicationContext factory = 
			new GenericXmlApplicationContext("/config/bean.xml");
		TV tv = factory.getBean("tv",TV.class);
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
	
	}

}
