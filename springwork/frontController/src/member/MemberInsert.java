package member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import front.fw.Action;

///member/customer/insert.do�� ��û�ϸ� ������ Ŭ����
public class MemberInsert implements Action {
	@Override
	public void run(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//��û���������ؼ� dao�� insert�޼ҵ带 ȣ��
		System.out.println("ȸ������ �����ϱ�");
	}

}
