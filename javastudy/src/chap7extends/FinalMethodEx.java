package chap7extends;

// final : 변경불가 의미
// final 메서드 : 오버라이딩(재정의) 불가 메서드

class FinalMethod {
	final void method() {
		System.out.println("FinalMethod의 method");
	}
}

class SubMethod extends FinalMethod {
//	void method() { 	  final 메서드를 오버라이딩을 해서 오류 
//		System.out.println("SubMethod의 method");
//	}
}

public class FinalMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
