package test.test1106;

class Outer1 {
	class Inner1 {
		int iv = 100;
	}

	static class Inner2 {
		int iv = 200;
	}
}

//Outer클래스의 내부 클래스 Inner1, inner2 의 멤버변수 iv의 값 출력
public class test3 {
	public static void main(String[] args) {
		Outer1 out = new Outer1();

		Outer1.Inner1 in1 = out.new Inner1(); // 인스턴스클래스 객체화할때 외부클래스먼저 객체화시킨후, 참조변수.new 인스턴스클래스명()
		System.out.println(in1.iv);

		Outer1.Inner2 in2 = new Outer1.Inner2(); // static클래스 객체화할때 외부클래스명.클래스명()
		System.out.println(in2.iv);
	}
}