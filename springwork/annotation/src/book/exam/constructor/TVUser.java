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
		TV tv1 = factory.getBean("samsung",TV.class);
		TV tv2 = factory.getBean("lg",TV.class);
		tv2.turnOn();
		tv2.soundUp();
		tv2.soundDown();
		tv2.turnOff();
	
	}

}
