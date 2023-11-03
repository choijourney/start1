package chap8interface;

// 인터페이스
// 1. 인터페이스멤버 : 상수,추상메서드,default메서드, static메서드만 가능
// 생성자없음 
// 2. 인터페이스 접근제어자 : public만 가능
// 3. 객체화불가 => 구현클래스(인터페이스를 구현)의 객체화로 객체화
// 4. 클래스와 인터페이스는 구현으로 표현함. => implements 예약어 사용
// => 다중 구현 가능
// 5. 인터페이스간의 상속 가능 => 다중 상속 가능

// 인터페이스 멤버
// 상수 :[public static final이생략] int NUM =100; 정상작동 안쓰면 알아서 써줌
//  	[public static] final int NUM =100; 정상작동
//		protectd int NUM=100;  에러 
// 추상메서드 : [public abstract 생략]void method();  정상작동 안쓰면 알아서 써줌
//  		 [public 생략] abstract void method();  
// default 메서드 : 구현부가 있는 메서드, 인스턴스멤버
// static 메서드 : 구현부가 있는 메서드, 클래스멤버

// 참조자료형 : 배열, 클래스, 인터페이스
interface Printable { // 변수처럼 생긴아이들은 모두 상수임
	int INK = 100; // 상수 public static final int INK =100; 에서 접근제어차들 생략

	void print(); // 추상메서드 {} 중괄호쓰면 에러남. 선언부만있어야함. public abstract void print();
}

public class InterfaceEx1 {

	public static void main(String[] args) {
//		Printable.INK=1000;  상수라서 값을 바꾸려고할때 오류
		System.out.println(Printable.INK); // static이라 객체화없이 쓸수있음
	}

}
