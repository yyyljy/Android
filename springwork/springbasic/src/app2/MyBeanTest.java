package app2;
/*
 * oop�� ����Ǿ� �ִ� ���α׷�
 * oopƯ���� �����ϱ� ���� ����Ŭ������ �����ϰ�  MyBeanStyleXX Ŭ������ ����ϴ�
 * �Ű������� Ÿ���� ����Ÿ������ �����ϸ� �������� �����ߴ�.
 * ���Ǵ� ��ü�� ����Ǵ��� �ڵ带 �����ϴ� ������ �پ���.
 * �׷��� ���� ��ü�� �����ϴ� �������� �����ؼ� �����ϰ� �ִ�.
 * ����ϴ� ��ü�� �ٲ𶧸��� ��ü�� ���� �����ϴ� �ڵ带 �����ؾߵǴ� ������ ������ ����.
*/
public class MyBeanTest {
	public static void main(String[] args) {
		MyBeanInterface obj = new MyBeanStyleA();
		run(obj);
		show(obj);
	}
	public static void run(MyBeanInterface obj) {
		System.out.println("BBBBBBBBBBBBBBBBBB");
		obj.hello("����");
		obj.hello("����");
		System.out.println("BBBBBBBBBBBBBBBBBB");
	}
	public static void show(MyBeanInterface obj) {
		System.out.println("22222222222222222");
		obj.hello("����");
		obj.hello("����");
		System.out.println("22222222222222222");
	}
}
