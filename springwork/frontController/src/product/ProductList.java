package product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import front.fw.Action;
//    /product/list.do�� ��û�ϸ� ����� Ŭ����
public class ProductList implements Action {
	@Override
	public void run(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("��ü ��ǰ ��� ��ȸ�ϱ�");
	}
}
