package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanTest4 {
	public static void main(String[] args) {
		//ApplicationContext보다 기능이 더 많다.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		//기본설정이 singleton이므로 getBean을 세번 호출해도
		//MyBeanStyle객체는 한개만 생성되어 호출된다.
		//따라서 init도 한 번만 호출된다
		MyBeanStyle obj1 = (MyBeanStyle)factory.getBean("myBean2");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean2");
		MyBeanStyle obj3 = (MyBeanStyle)factory.getBean("myBean2");
		run(obj1);
		show(obj1);
		
		//컨테이너에 의해 생성된 객체가 소멸되는 시점은 컨테이너가 소멸될 때
		factory.close();
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("RRRRRRRRRRRRRRRRRR");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("RRRRRRRRRRRRRRRRRR");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("SSSSSSSSSSSSSSSSSS");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("SSSSSSSSSSSSSSSSSS");
	}
}
