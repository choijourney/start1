package chap06class;

// 메서드 오버로딩 : 메서드의 다형성
// 1. 동일한 클래스 내부에 같은 이름을 가진 메서드가 여러개 존재 할 수 있다.
// 2. 단 매개변수 목록이 달라야 한다.(자료형 기준-> 형,개수,순서) 
// 메서드 이름이 같고 매개변수 타입이 다르면됨
class Math2 {
	// 매개변수 목록이 다른 경우는 자료형 기준임. 매개변수명이 다르다고 오버로딩 되지않는다.
	int a = 100;

	int add(int b) {
		System.out.print("1:");
		return a + b;
	}

	double add(double b) {
		System.out.print("2:");
		return a + b;
	}

	String add(String b) {
		System.out.print("3:");
		return a + b;
	}
}

public class OverloadingEx1 {

	public static void main(String[] args) {
		Math2 m = new Math2();
		System.out.println(m.add(10));
		System.out.println(m.add(10.5));
		System.out.println(m.add("번"));
		System.out.println(m.add(10L)); // 2번 double add메서드실행 같은자료형메서드가 있으면 실행하고 -> 없다면 자동형변환이 가능한 메서드를 실행함
		System.out.println(m.add(10f)); // 2번 double add메서드실행
//		System.out.println(m.add( new int[1]));  배열타입은 대입될 메서드가 없어서 오류 

	}

}
