package app2;
/*
 * oop가 적용되어 있는 프로그램
 * oop특성을 적용하기 위해 상위클래스를 정의하고  MyBeanStyleXX 클래스를 사용하는
 * 매개변수의 타입을 상위타입으로 변경하며 다형성을 적용했다.
 * 사용되는 객체가 변경되더라도 코드를 수정하는 범위는 줄어든다.
 * 그러나 실제 객체를 전달하는 곳에서는 생성해서 전달하고 있다.
 * 사용하는 객체가 바뀔때마다 객체를 직접 생성하는 코드를 수정해야되는 단점은 여전히 존재.
*/
public class MyBeanTest {
	public static void main(String[] args) {
		MyBeanInterface obj = new MyBeanStyleA();
		run(obj);
		show(obj);
	}
	public static void run(MyBeanInterface obj) {
		System.out.println("BBBBBBBBBBBBBBBBBB");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("BBBBBBBBBBBBBBBBBB");
	}
	public static void show(MyBeanInterface obj) {
		System.out.println("22222222222222222");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("22222222222222222");
	}
}
