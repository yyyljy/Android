package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanTest3 {
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		MyBeanStyle obj1 = (MyBeanStyle)factory.getBean("myBean1");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean1");
		if(obj1==obj2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		run(obj1);
		show(obj1);
		run(obj2);
		show(obj2);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("BBBBBBBBBBBBBBBBBB");
		obj.hello("����");
		obj.hello("����");
		System.out.println("BBBBBBBBBBBBBBBBBB");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("22222222222222222");
		obj.hello("����");
		obj.hello("����");
		System.out.println("22222222222222222");
	}
}
