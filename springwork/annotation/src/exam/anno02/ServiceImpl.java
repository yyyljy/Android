package exam.anno02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements MyService {
	@Autowired
	@Qualifier("mylogic")
	Logic mylogic;
	String name;
	String msg;
	
	public ServiceImpl() {
		
	}
	public ServiceImpl(Logic mylogic, String name, String msg) {
		super();
		this.mylogic = mylogic;
		this.name = name;
		this.msg = msg;
		System.out.println("ServiceImpl�� �Ű�����3�� ������");
	}

	@Override
	public void test() {
		//Logic�� �޼ҵ带 ȣ���ϴ� �޼ҵ�
//		System.out.println(msg+","+name);
		mylogic.testLogic();
	}

}
