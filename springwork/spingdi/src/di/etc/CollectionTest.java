package di.etc;
//�ɹ������� List�� Map�� ��� DI�� ��� �����ϳ�?
//�ɹ������� �߰��� List�� Map�� �����ʹ� xml���� �߰�
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CollectionTest {
	private ArrayList<String> list;
	private HashMap<String, String> map;
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
	//ArrayList�� ����� ������ ����ϱ�
	public void getList() {
		System.out.println("***ArrayList�� ����� ������***");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public void getMap() {
		System.out.println("***HashMap�� ����� ������***");
		Set<String> keylist = map.keySet();
		for (String key : keylist) {
			System.out.println("key:"+key+","+"value"+map.get(key));
		}
	}
}