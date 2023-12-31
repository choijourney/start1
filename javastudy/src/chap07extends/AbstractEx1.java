package chap07extends;

// 추상클래스
// 1. 추상메서드를 멤버로 가질수 있는 클래스 => abstract 예약어 사용
// 2. 객체화 불가 => 상속으로 자손클래스의 객체화로 객체화됨 (super로만 객체화)
// 3. 그외는 일반클래스와 동일함(생성자,멤버변수,초기화블럭,다른클래스를 상속받을수도있음..등)

// 추상 메서드
// 1. 메서드의 선언부만 존재함. 구현부{} 가 업다. => abstract 예약어 사용
// 2. 자손클래스에서 반드시 오버라이딩 필요.

//제어자 : abstract => 클래스에서 사용 => 추상클래스 
//					=> 메서드에서 사용 => 추상메서드
abstract class Shape { // 추상클래스만 추상메서드를 멤버로 가질수있다
	String type;

	Shape(String type) {
		this.type = type;
	}

	abstract double area(); // 추상메서드 {} 구현하면 오류남

	abstract double length();
}

class Circle extends Shape { // area(), length()메서드를 반드시 오버라이딩 해야함
	int r;

	Circle(int r) {
		super("원");
		this.r = r;
	}

	@Override
	double area() {
		return r * r * Math.PI;
	}

	@Override
	double length() {
		return r * 2 * Math.PI;
	}
}

// 사각형(Rectangle) 클래스 구현하기
// Shape클래스 상속받은 클래스
// 멤버변수 : width, height
// 멤버메서드 : area(),length() 

class Rectangle extends Shape {
	int width, height;

	Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return width * height;
	}

	@Override
	double length() {
		return (width + height) * 2;
	}
}

public class AbstractEx1 {

	public static void main(String[] args) {
//		Shape s = new Shape("도형");  추상클래스는 객체화 불가라서 오류
		Shape s = new Circle(10);
		System.out.println(s.area());
		System.out.println(s.length());
//		System.out.println(s.r);  r은 Shape 의 멤버가 아니라 오류남  꼭 s.r을 쓰고싶다면 아래처럼 형변환을함
		System.out.println(((Circle) s).r); // 같은말
		Circle c = (Circle) s; // 같은말
	}

}
