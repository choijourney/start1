package chap6class;

class Car3 {
	String color;
	int number;
	int sno;
	static int width = 200;
	static int height = 120;
	static int cnt;

	Car3(String c, int n) {
		color = c;
		number = n;
		sno = ++cnt;
	}

	Car3(String c) { // 하나의 클래스안에 생성자 여러개를 만들수있다. 생성자 오버로딩
		color = c;
		number = 1000;
		sno = ++cnt;
	}

	Car3(int n) { // 하나의 클래스안에 생성자 여러개를 만들수있다. 생성자 오버로딩
		color = "White";
		number = n;
		sno = ++cnt;
	}

	public String toString() {
		return sno + "번자동차: " + color + "," + number + "(" + width + "," + height + ")";
	}
}

public class CarEx3 {

	public static void main(String[] args) {
		Car3 c1 = new Car3("White", 1234);
		System.out.println(c1);
		Car3 c2 = new Car3("Black");
		System.out.println(c2);
		Car3 c3 = new Car3(2000);
		System.out.println(c3);
	}

}
