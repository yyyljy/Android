package basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	//1.�����ڸ� �̿��ؼ� �۾�
	public InsaImpl() {//�⺻ ������
	}
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
	}
	//2.setter�޼ҵ带 �̿��ؼ� �۾�
	
	@Override
	public void addUser(MemberDTO user) {
		dao = new MemberDAO();
		dao.add(user);		
	}

	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}
	@Override
	public MemberDTO getUser(String id) {
		MemberDTO user = null;
		user = dao.getUser("id");
		return user;
	}

}
