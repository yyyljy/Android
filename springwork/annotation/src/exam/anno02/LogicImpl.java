package exam.anno02;

public class LogicImpl implements Logic {
	public LogicImpl() {
		System.out.println("LogicImpl����");
	}
	@Override
	public void testLogic() {
		System.out.println("db����, xml�Ľ�, json�Ľ�,��Ÿ �����Ͻ� ���� ����");
	}
}
