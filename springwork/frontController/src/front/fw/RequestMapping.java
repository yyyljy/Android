package front.fw;

import java.util.HashMap;

import member.LoginAction;
import member.MemberInsert;
import product.ProductList;

/*
 * FrontServlet�� �Ѱ��� ��û path�� ������ ���� ������ Ŭ������ ��ü�� ���� 
 * �����ϴ� �۾��� ����
 * => �̸� ��û path���� ������ ���� Ŭ������ ����� ���������� ���� ��ü�� ã�Ƽ� ����
 *    mycommand.properties���Ͽ� ��ϵ� ��ûpath�� ���� ������ ��ü�� ã�´�.
 *    xml�����̳� properties������ �Ľ��ϴ� �ڵ带 ����
 */
public class RequestMapping {
	//xml�̳� properties������ �Ľ��ؼ� �����س��� ��ü�� ������ map
	//��ûpath�� key, ���������Ұ�ü value
	private HashMap<String,Action> actionMap = 
			 new HashMap<String,Action>();
	public RequestMapping() {
		//������ ���ο��� ���������� �Ľ��ؼ� ��ü�� ����� �ڵ尡 ���ǵǾ�� �Ѵ�.
	}
	public Action mapping(String path) {
		//�Ű������� ���޵� path�� ��ϵ� Action��ü�� actionMap���� ã�Ƽ� ����
		//�ϴ� �ڵ尡 ���ǵǾ�� �ϳ� �츮�� if...else if�� �켱 ó��
		//���� �ڵ�� �������̹Ƿ� �߰��� �Ǹ� mapping�޼ҵ带 �����ؾ� ������
		//������ xml������ properties������ �м��ؼ� �ڵ����� ���鵵�� �ڵ带
		//������ ���̹Ƿ� �ڵ� ������ ���� �ʾƵ��ȴ�.
		Action action = null;
		if(path.equals("/product/list.do")) {
			action = new ProductList();
		}else if(path.equals("/member/customer/insert.do")) {
			action = new MemberInsert();
		}else if(path.equals("/login.do")) {
			action = new LoginAction();
		}
		//.........
		return action;
	}
	
}








