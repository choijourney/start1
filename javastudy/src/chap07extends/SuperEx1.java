package chap07extends;

//super 예약어
//super() 생성자 : 부모클래스의 생성자를 호출시 사용. 자손클래스 생성자의 첫줄에 구현해야함
// 	자손클래스에서 부모클래스의 생성자의 매개변수 설정에 맞도록 호출
// 	부모클래스의 생성자 중 매개변수가 없는 생성자가 있다면 생략 가능 : super()
// 	부모클래스의 생성자 중 매개변수가 없는 생성자가 없다면 생략 불가 : super(...)

//super 참조변수 : 부모클래스의 객체를 참조하는 참조변수
//		인스턴스 메서드에서만 사용가능
class Parent {
	int x = 10;

	Parent(int x) {
		this.x = x;
	}
}

class Child extends Parent {
	int x = 20;

	Child() {
		super(100); // 부모클래스의 생성자 호출. 첫줄에서 호출해야함
		System.out.println("Child 클래스의 생성자");
	}

	void method() { // static을 붙이면 this와 super를 쓸 수없다. 인스턴스메서드에서만 쓸수있다
		int x = 30;
		System.out.println("x=" + x); // 30
		System.out.println("this.x=" + this.x); // 20 만약 Child의 int x를 없애면 부모 x를 가져다 써서 100 출력
		System.out.println("super.x=" + super.x);// 100
	}
}

public class SuperEx1 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();

	}

}
