package test.test1101;

/*
 * 원(Circle) 클래스 구현하기
 *  1. 멤버변수
 *       반지름(r),x좌표(x),y좌표(y), 원의번호(no)
 *       원의번호 생성 변수 count
 *  2. 생성자 : 구동 클래스에 맞도록 설정하기     
 *  3. 멤버메서드
 *     (1) double area()  : 원의 넓이 리턴. Math.PI 상수 사용
 *     (2) double length(): 원의 둘레 리턴. Math.PI 상수 사용
 *     (3) void move(int a, int b): x,y좌표를 x+a, y+b로 이동.
 *     (4) void scale(double m): 반지름을 m배 확대/축소. r=r*m
 *     (5) String toString() :
 *         1번원 : 반지름:10, 좌표:(10,10), 넓이:314.xxx, 둘레:xxx.xxx
 *         ... */
class Circle {
	int r, x, y, no; // 반지름, x좌표,y좌표,원의번호
	static int count; // Circle 객체의 개수

	Circle(int r, int x, int y) {
		this.r = r;
		this.x = x;
		this.y = y;
		no = ++count; // 원의 번호

	}

	Circle(int x, int y) {
		this(1, x, y);
	}

	Circle(int r) { // r인지확실치않음
		this(r, 1, 1);
	}

	double area() {
		return Math.PI * (r * r);
	}

	double length() {
		return 2 * Math.PI * r;
	}

	void move(int x, int y) { // 인스턴스 메서드라 this를 사용할수있다.
		this.x = x;
		this.y = y;
	}

	void scale(double m) { // 반지름을 m배 확대/축소
		r *= m;
//		r=r*m;  이면 int형 r에 double을 대입하는거라 오류남 r*=m 이면 자동형변환이돼서 괜찮음
	}

	public String toString() {
		return String.format("%d번원: 반지름:%d, 좌표:(%d,%d), 넓이:%.3f, 둘레:%.3f", no, r, x, y, area(), length());
	}
}

public class test4 {

	public static void main(String[] args) {
		Circle[] carr = new Circle[3];
		carr[0] = new Circle(10, 10, 10); // 반지름,x좌표,y좌표
		carr[1] = new Circle(20, 20); // x좌표,y좌표
		carr[2] = new Circle(100); // 반지름
		for (Circle c : carr) {
			System.out.println(c);
			c.move(10, 10);
			System.out.println(c);
			c.scale(3);
			System.out.println(c);
		}

	}

}
