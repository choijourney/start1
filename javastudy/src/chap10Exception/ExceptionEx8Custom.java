package chap10Exception;

// 사용자 예외 클래스 구현하기
// Exception 클래스 상속 : 예외처리가 필수인 예외클래스 생성
// RuntimeException 클래스 상속 : 예외처리가 생략 가능한 예외클래스 생성

class LoginFailException extends Exception {
	LoginFailException(String msg) {
		super(msg);
	}
}

class LoginFailException2 extends RuntimeException {
	LoginFailException2(String msg) {
		super(msg);
	}
}

public class ExceptionEx8Custom {

	public static void main(String[] args) {
		String id = "hong1";
		String pw = "1234";
		if (!id.equals("hong") || !pw.equals("1234"))
			throw new LoginFailException2("아이디 또는 비밀번호가 틀립니다."); // RuntimeException을상속받았기때문에 throws Exception을 안해도됨
		try {
			if (!id.equals("hong") || !pw.equals("1234"))
				throw new LoginFailException("아이디 또는 비밀번호가 틀립니다.");
			System.out.println("반갑습니다. hong 님");
		} catch (LoginFailException e) {
			System.out.println(e.getMessage());
		}

	}

}
