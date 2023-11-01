package chap7extends;

// 상속 예제 : extends 예약어를 이용하여 구현
//  - 자손클래스의 객체 생성시 부모객체를 먼저 생성한다.
// - 단일 상속만 가능하다. (자손클래스에서 단일 상속)
// - 모든 클래스는 Object 클래스를 상속 받는다@@@ extends Object 가 안보이지만 생략돼있는거다.
// - 모든 클래스의 객체는 Object 클래스의 객체를 상속받는다.
//    => 모든 클래스의 객체는 Objcet 클래스의 멤버를 호출 할 수 있다.

class Phone { // extends Object 가 숨겨져있음
	boolean power;
	int number;

	void power() {
		power = !power;
	}

	void send() {
		if (power)
			System.out.println("전화 걸기");
	}

	void receive() {
		if (power)
			System.out.println("전화 받기");
	}
}

// SmartPhone 클래스는 Phone 클래스의 하위(자손,자식,child,sub)클래스 임.
// Phone 클래스는 SmartPhone 클래스의 상위(부모,super,parent,base) 클래스임
class SmartPhone extends Phone {
	void setApp(String name) {
		System.out.println(name + "앱을 설치함");
	}
}

public class PhoneEx1 {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone(); // 자손 객체를 만들면 부모객체부터 먼저 만든다
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("카카오");

	}

}
