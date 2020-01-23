package di.setter.basic;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("config/setter.xml");
		Insa insa = factory.getBean("insa", Insa.class);
		MemberDTO user = new MemberDTO("jang","1234","�嵿��");
		insa.addUser(user);
		
	}

}
