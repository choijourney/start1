package chap09innerClassEnum;

// 중첩클래스(내부클래스) : 클래스 내부에 존재하는 클래스
// - 인스턴스 중첩클래스 : 객체화시 외부클래스의 객체화 필요. 
// - static 중첩클래스: new 외부클래스명.중첩클래스명()  <-생성자임
// - local 중첩클래스 : 메서드 내부에서 선언된 클래스. 해당 메서드에서만 접근가능.

// 중첩클래스의 특징
//1. 참조자료형으로 사용됨. 객체화 가능. Object 클래스의 하위클래스. 다른클래스를 상속받을수있음.
// 	외부클래스명.중첩클래스 
//	중첩클래스별로 바이트코드 생성
//2. 외부클래스의 private멤버에 접근 가능. 외부클래스 입장에서보면 중첩클래스는 외부클래스안에 포함돼있는클래스라서 private에 접근가능하다

class Outer1 {
	// 인스턴스중첩클래스 : 외부클래스가 객체화가 되어야 클래스가 됨
	// 외부클래스 객체화 후 내부클래스의 객체화 가능
	class InstanceInner { // Object의 하위클래스, 다른클래스 상속가능
		int iv = 100;
		static int cv = 10;
		final static int MAX = 200;
	}

	// static 중첩클래스 : 외부클래스의 클래스멤버. 외부클래스 객체화 필요없음.
	// new 외부클래스.내부클래스() 로 객체화가능
	static class StaticInner { // Object의 하위클래스,다른클래스 상속가능
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}

	void method() {
		// method() 내부에서만 사용가능.
		class LocalInner { // local 중첩클래스 : 메서드 내부에서 선언된 클래스.메서드안에서만 객체화할수있음 Object의 하위클래스, 다른클래스 상속가능
			int iv = 600;
			static int cv = 700;
			final static int MAX = 800;
		}
		LocalInner lc = new LocalInner(); // 중첩클래스의 객체화
		System.out.println("lc.iv=" + lc.iv); // 600
		System.out.println("lc.cv=" + lc.cv); // 700
		System.out.println("LocalInner.cv=" + LocalInner.cv); // 700
		System.out.println("LocalInner.MAX=" + LocalInner.MAX); // 800
	}
}

public class InnerEx1staticinstanceclass {

	public static void main(String[] args) {
		Outer1 out = new Outer1();
		out.method();
		// InstanceInner 클래스의 객체화
		Outer1.InstanceInner in1 = out.new InstanceInner(); // 외부클래스먼저 객체화한후 내부클래스 객체화할수있음
		Outer1.InstanceInner in11 = new Outer1().new InstanceInner();
		// InstanceInner 멤버값 출력
		System.out.println("in1.iv=" + in1.iv); // 내부클래스의 객체화 필요
		System.out.println("Outer1.InstanceInner.cv=" + Outer1.InstanceInner.cv);
		System.out.println("Outer1.InstanceInner.MAX=" + Outer1.InstanceInner.MAX);
		// StaticInner 클래스의 객체화
		Outer1.StaticInner in2 = new Outer1.StaticInner();
		// StaticInner 멤버값 출력
		System.out.println("in2.iv=" + in2.iv); // 내부클래스의 객체화 필요
		System.out.println("Outer1.StaticInner.cv=" + Outer1.StaticInner.cv);
		System.out.println("Outer1.StaticInner.MAX=" + Outer1.StaticInner.MAX);
	}

}
