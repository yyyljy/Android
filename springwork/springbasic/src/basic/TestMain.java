package basic;
public class TestMain {
	public static void main(String[] args) {
		//1. �����ڸ� ȣ���ϴ� ���
		/*MemberDAO dao = new MemberDAO();
		Insa insa = new InsaImpl(dao);*/
		//2. setter�޼ҵ带 ȣ���ϴ� ���
		MemberDAO dao = new MemberDAO();
		Insa insa = new InsaImpl();
		insa.setDao(dao);
		
		MemberDTO user = new MemberDTO("jang","1234","�嵿��");
		insa.addUser(user);
	}
}
