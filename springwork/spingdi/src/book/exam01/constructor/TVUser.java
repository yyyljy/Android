package book.exam01.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
/*
 * ������ �����̳ʿ� ���� �����ؼ� ��ü�� ���� �޾� ����� �� �ֵ��� �����ϱ�
 * Dependency Lookup����
 * ��������:config/bean.xml
 * �� ���:
 * 		SamsungTV => samsung
 * 		LgTV => lg
 * getBean���� ���ͼ� �۾��ϵ��� �ڵ� �����ϱ�
*/		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		//TVInterface Stv = (TVInterface)factory.getBean("samsung");
		//TVInterface Ltv = (TVInterface)factory.getBean("lg");
		TVInterface tv = factory.getBean("tv", TVInterface.class);
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		factory.close();
	}
}
