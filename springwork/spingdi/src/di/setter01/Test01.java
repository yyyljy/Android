package di.setter01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("config/setter.xml");
		Player p = factory.getBean("player", Player.class);
		p.play();
		
		/*Player p = new Player();
		p.play();*/
		System.out.println("���� ���� �ֻ����� ��:"+p.getTotalValue());
	}
}
