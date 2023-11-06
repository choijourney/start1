package chap8interface;

// JDK 8 이전 : 인터페이스의 멤버는 상수와 추상메서드만 가능함
// JDK 8 이후 : default 메서드 , static 메서드 추가함 => 구현부 존재 가능

// 인터페이스 내에 구현부가 존재하는 메서드

// default 메서드 : 인스턴스멤버. 참조변수명.메서드명 호출
// static 메서드 : 클래스멤버. 반드시 인터페이스명.메서드명 호출. 구현된클래스로 호출불가

// 인터페이스는 다중 구현이 가능함
// => 구현클래스의 객체에서 같은 메서드(선언부가 같다)가 존재할수있음
// => 구현클래스에서 default메서드를 오버라이딩 해야함

// static 메서드는 같은 메서드가 여러개 존재해도, 인터페이스명.메서드명 으로 호출되므로 상관없다

interface MyInterface1 {
	void method();

	default void method1() {
		System.out.println("MyInterface1의 default 메서드 :method1");
	}

	static void method2() {
		System.out.println("MyInterface1의 static 메서드 :method2");
	}
}

class Parent {
	public void pmethod() {
		System.out.println("Parent 클래스의 pmethod()");
	}
}

interface MyInterface2 {
	void method();

	default void method1() {
		System.out.println("MyInterface2의 default 메서드 :method1");
	}

	static void method2() {
		System.out.println("MyInterface2의 static 메서드 :method2");
	}
}

class Child extends Parent implements MyInterface1, MyInterface2 {
	// 인터페이스두개를 구현함. 두인터페이스에 method1이라는 이름이 같은 메서드가있음 그럴때 오버라이딩해서 둘중 어떤메서드를 쓸건지
	// 인터페이스명과 super를씀.
	@Override
	public void method() {
		System.out.println("Child 클래스의 method()");
	}

	@Override
	public void method1() { // default 메서드는 오버라이딩 가능
		MyInterface1.super.method1(); // MyInterface1의 method1 호출
		MyInterface2.super.method1(); // MyInterface2의 method1 호출
	}
}

public class InterfaceEx5defaultstaticmethod {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.method1(); // MyInterface1.method1 default메서드. 참조변수명.메서드명 호출가능
//		c.method2(); method2()는 인터페이스의 static메서드라서  인터페이스명.메서드 를 써야한다
		MyInterface1.method2(); // static메서드 호출
		c.pmethod();
	}

}
