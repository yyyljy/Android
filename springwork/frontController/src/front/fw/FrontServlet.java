package front.fw;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//��� ��û�� FrontServlet�� ���� ���� �� �ֵ��� ����
@WebServlet(name="front",urlPatterns= {"*.do","*.jsp","*.html"})
public class FrontServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. ��û ������ �м��ؼ� ���� - �  path�� ��û���� ???
		System.out.println("��û�ޱ�");
		System.out.println("request.getContextPath()=>"
								+request.getContextPath());
		System.out.println("request.getRequestURI()=>"+
								request.getRequestURI());
		
		String contextPath = request.getContextPath();
		String requestURI = request.getRequestURI();
		String path = requestURI.substring(contextPath.length()); 
		System.out.println("path=>"+path);
	
		//������ ��û path�� ��ϵǾ� �ִ� ������ Ŭ���� ������ ã�ƿ��� �۾�
		//RequestMapping��ü�� �Ƿ� => RequestMapping��ü�� �޼ҵ带 ȣ��
		//                          �ϸ� ���� ������ ��ü�� ã�Ƽ� ����
		RequestMapping mappingObj = new RequestMapping();
		Action action = mappingObj.mapping(path);
		
		//Action��ü�� �޼ҵ带 ȣ��
		action.run(request, response);
		
		//run�޼ҵ��� �������� �޾Ƽ� ����view�� ã�´�.
		
		//����view�� forward or redirect
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
