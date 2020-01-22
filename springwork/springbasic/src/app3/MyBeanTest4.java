package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanTest4 {
	public static void main(String[] args) {
		//ApplicationContext���� ����� �� ����.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		//�⺻������ singleton�̹Ƿ� getBean�� ���� ȣ���ص�
		//MyBeanStyle��ü�� �Ѱ��� �����Ǿ� ȣ��ȴ�.
		//���� init�� �� ���� ȣ��ȴ�
		MyBeanStyle obj1 = (MyBeanStyle)factory.getBean("myBean2");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean2");
		MyBeanStyle obj3 = (MyBeanStyle)factory.getBean("myBean2");
		run(obj1);
		show(obj1);
		
		//�����̳ʿ� ���� ������ ��ü�� �Ҹ�Ǵ� ������ �����̳ʰ� �Ҹ�� ��
		factory.close();
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("RRRRRRRRRRRRRRRRRR");
		obj.hello("����");
		obj.hello("����");
		System.out.println("RRRRRRRRRRRRRRRRRR");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("SSSSSSSSSSSSSSSSSS");
		obj.hello("����");
		obj.hello("����");
		System.out.println("SSSSSSSSSSSSSSSSSS");
	}
}
