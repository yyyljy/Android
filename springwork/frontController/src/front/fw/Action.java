package front.fw;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//���� ������ Ŭ������ ����Ÿ��
//RequestMappingŬ������ ������ Ŭ������ ã�Ƽ� �����Ҷ� ������ Ÿ���� �־�� �ϱ�
//������ ����Ÿ������ ����� Ŭ���� - ������ �����ϴ� ������ ������ Ŭ����
public interface Action {
	void run(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException,IOException;
}
