package chap07extends;

// 추상클래스간의 상속
// 추상클래스가 추상클래스를 상속받을 수 있다. 부모추상클래스에 추상메서드가 있으면 자손추상클래스에서 구현하지않아도된다
// 추상클래스가 아닌 일반 클래스에서 부모,자손 추상클래스를 한번에 구현하면된다.
abstract class Abs1 { // 추상클래스
	int a = 10;

	abstract int getA(); // 추상메서드
}

abstract class Abs2 extends Abs1 { // 추상클래스
	int b = 20;

	abstract int getB(); // 추상메서드
}

class Normal extends Abs2 {

	@Override
	int getB() {
		return b;
	}

	@Override
	int getA() {
		return a;
	}

}

public class AbstractEx3 {

	public static void main(String[] args) {
		Normal n = new Normal();
		System.out.println(n.a); // 10
		System.out.println(n.getA()); // 10
		System.out.println(n.b); // 20
		System.out.println(n.getB()); // 20

		System.out.println("Abs2 타입으로 형변환");
		Abs2 a2 = n; // 자손타입의 참조변수를 부모타입 참조변수a2에 대입
		System.out.println(a2.a); // 10
		System.out.println(a2.getA()); // 10
		System.out.println(a2.b); // 20
		System.out.println(a2.getB()); // 20

		System.out.println("Abs1 타입으로 형변환");
		Abs1 a1 = n;
		System.out.println(a1.a); // 10
		System.out.println(a1.getA()); // 10
//		System.out.println(a1.b);  오류
//		System.out.println(a1.getB());   오류

		System.out.println("Object 타입으로 형변환");
		Object o = n; // 자손타입의 참조변수를 부모타입 참조변수a2에 대입
//		System.out.println(o.a);  오류
//		System.out.println(o.getA()); 
//		System.out.println(o.b); 
//		System.out.println(o.getB()); 
	}

}
