package exam.anno02;

public class ServiceImpl implements Service {
	Logic mylogic;
	String name;
	String msg;
	
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
		System.out.println(msg+","+name);
		mylogic.testLogic();
	}

}
