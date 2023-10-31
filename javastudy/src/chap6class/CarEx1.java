package chap6class;

// 선언 위치에 따른 변수의 종류
// 클래스 변수  클래스내부에 선언	/ static 자료형 변수명 / 클래스 정보 로드시 바로 메모리할당 / 메모리할당위치 클래스영역 
// - 객체화 필요없음.모든 객체의 공통 변수로 사용됨
// - 클래스명.변수명 Car.width  car1.width 참조변수로도 사용가능하지만 Car.width로 쓰는게 좋다
// - 기본값으로 초기화
// 인스턴스 변수(객체변수) 클래스내부에 선언  / 자료형 변수명 / 객체화시 메모리할당 / 메모리할당위치 힙영역
// - 반드시 객체화 되어야함. 객체별로 다른 메모리 할당
// - 참조변수명.변수명 car.color 
// - 기본값으로 초기화
// 지역변수 메서드 내부에 선언 / 자료형 변수명 / 선언문을 실행할때 메모리 할당 / 메모리할당위치 스택영역
// - 메서드,블럭내에서만 사용가능함. 다른 메서드에선 사용할수없다
// - 기본값으로 초기화안됨. 반드시 초기화 해야함.
// - 매개변수는 지역변수다.(args)
class Car {
	String color; // 인스턴스변수,객체변수
	int number; // 인스턴스 변수
	static int width = 200; // 클래스변수,static변수,정적변수
	static int height = 120;

	public String toString() {
		return color + ":" + number + "(" + width + "," + height + ")";
	}
}

public class CarEx1 {

	public static void main(String[] args) {
		System.out.println("자동차의 크기: " + Car.width + "," + Car.height);
//		System.out.println("자동차의 크기: " + Car.color); // 오류발생
		Car car1 = new Car(); // car1 지역변수 객체만들면서 초기화가 돼서 사용가능
		car1.color = "White";
		car1.number = 1234;
//		System.out.println(car1); // toString이 자동출력. toString생략가능
		System.out.println("car1:" + car1.toString());

		Car car2 = new Car(); // 지역변수
		car2.color = "Black";
		car2.number = 2345;
		System.out.println("car2:" + car2.toString());

		Car car3 = new Car(); // 지역변수
		car3.color = "Red";
		car3.number = 3456;
		System.out.println("car3:" + car3.toString());
		System.out.println("car3의 whidth height 변경");
		car3.width = 300;
		car3.height = 200;

		System.out.println("car1:" + car1.toString());
		System.out.println("car2:" + car2.toString());
		System.out.println("car3:" + car3.toString());

		int num; // 지역변수
		int i;
		boolean b = true;
		if (b) {
			i = 100;
		} else {
			i = 0;
		}
		System.out.println(i); // else를 안쓰면 초기화안될 가능성이 있기때문에 오류남 (else if도)
	}

}
