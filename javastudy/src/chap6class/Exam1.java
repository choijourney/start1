package chap6class;

// 1. 직사각형 클래스(Rectangle) 구현하기
// 멤버변수: 가로(width) 세로(height)
// 메서드 : void area() => 넓이를 출력해주는 기능
// 메서드 : void length() => 둘레 출력 기능

// 2. 구동클래스(Exam1.java) : main메서드가 존재하는 클래스
// - Rectangle 클래스의 객체 생성하여 r1 참조변수로 참조하기
// -  가로,세로 길이를 10,5 저장하기
// - r1 사각형의 넓이, 둘레 출력하기
class Rectangle {
	int width, height; // 멤버변수

	void area() {
		System.out.println("사각형의 넓이는 : " + width * height);
	}

	void length() {
		System.out.println("사각형의 둘레는 : " + (width + height) * 2);
	}
}

public class Exam1 {

	public static void main(String[] args) {
		Rectangle3 r1 = new Rectangle3();
		r1.width = 10;
		r1.height = 5;
		r1.area();
		r1.length();

	}

}
