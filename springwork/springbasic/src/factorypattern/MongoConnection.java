package factorypattern;
public class MongoConnection extends Connection {
	public MongoConnection(String url) {
		super(url);
	}

	public void connect() {
		System.out.println(url + "��ġ�� MongoDB ������ ������ �õ��մϴ�.");
	}
}
