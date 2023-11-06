package chap8interface;

// 추상클래스와 인터페이스는 객체화가 안된다. 객체화 할수있는 방법이 따로있음
// 추상클래스와 인터페이스의 객체화 => 이름없는 객체.(익명객체) 이름없는 내부 클래스

interface Action {
	void action();
}

abstract class Abs {
	int num = 100;

	abstract void method();
}

public class InterfaceEx4annonymousobject {

	public static void main(String[] args) {

		// 인터페이스의 객체화 new Action() 옆에 중괄호를 쓰고 구현해야할 추상메서드를 구현하면됨 -익명객체
		Action a = new Action() {
			@Override
			public void action() {
				System.out.println("Action 인터페이스의 action 메서드");

			}
		};
		a.action();

		// 추상클래스의 객체화
		Abs ab = new Abs() {
			@Override
			void method() {
				System.out.println("num=" + this.num);
			}
		};
		ab.method();
	}

}
