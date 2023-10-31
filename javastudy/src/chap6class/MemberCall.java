package chap6class;

// 클래스 - 변수  -클래스 변수
//			   - 인스턴스 변수
// 		- 메서드 - 클래스 메서드
// 				- 인스턴스 메서드
// 클래스 멤버 = 클래스 변수 + 클래스 메서드
// 인스턴스 멤버 = 인스턴스 변수+ 인스턴스 메서드

// 클래스 멤버에서 클래스 멤버 호출 : 정상
// 인스턴스 멤버에서 인스턴스 멤버 호출 : 정상
// 인스턴스 멤버에서 클래스 멤버 호출 : 정상
// 클래스 멤버에서 인스턴스 멤버 호출 : 직접호출 불가 , 객체화 필요@

// 같은 멤버들끼리는 클래스명,참조변수명 등을 생략 가능.
// 단, 클래스멤버에서 인스턴스멤버 호출시 객체화 필요하므로 이때는 참조변수명을 사용함.
public class MemberCall {
	static int cv1 = 10;
	static int cv2 = cv1; // 클래스 변수= 클래스 변수 정상
	int iv1 = 100;
	int iv2 = iv1; // 인스턴스 변수 = 인스턴스 변수 정상
	int iv3 = cv1; // 인스턴스멤버가 클래스멤버 호출은 가능
//static int cv3=iv1;  클래스멤버에서 인스턴스 멤버를 호출하면 오류
	static int cve = new MemberCall().iv1; // 클래스멤버가 인스턴스멤버를 호출시 객체화하면됨

	void method1() { // 인스턴스 메서드
		System.out.println("cv1+cv2=" + (cv1 + cv2)); // 클래스메서드 호출 가능
		System.out.println("iv1+iv2=" + (iv1 + iv2)); //
	}

	static void method2() { // 클래스 메서드
		System.out.println("cv1+cv2=" + (cv1 + cv2)); // 클래스 메서드 호출 가능
//		System.out.println("iv1+iv2="+(iv1+iv2)); // static멤버가 인스턴스멤버를 호출 불가
		MemberCall m = new MemberCall();
		System.out.println("iv1+iv2=" + (m.iv1 + m.iv2)); // 인스턴스 호출시 객체화 필요
	}

	void method3() { // 인스턴스 메서드에서 static메서드 호출 가능
		method1(); // 인스턴스 메서드 호출
		method2(); // 클래스 메서드 호출
	}

	static void method4() { // 클래스 메서드
//		method1(); 	  인스턴스 메서드 호출 불가 : 클래스메서드를 호출하는 시점에 인스턴스메서드가 객체화가 되지않았을때 준비가안됐으니 불가
		new MemberCall().method1(); // 인스턴스 메서드 호출시 객체화 필요
		method2();
	}

	public static void main(String[] args) { // 클래스메서드
		// method1~4 까지 호출하기

		MemberCall m = new MemberCall();
		m.method1();
		m.method2();
		m.method3();
		m.method4();

		MemberCall.method2(); // static메서드는 객체화없이 클래스명.메서드로 바로쓸수있다
		method4(); // 같은 클래스 안에 있으면 클래스명을 안써도 된다
	}

}
