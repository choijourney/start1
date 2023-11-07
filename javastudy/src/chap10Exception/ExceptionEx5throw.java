package chap10Exception;

// throws : 예외처리. 예외던지기
// throw : 예외발생.없는 예외를 강제로 발생	
// - 메서드안에서 예외처리를하고 throw를 써서 main에서도 예외처리를할수있게함	
public class ExceptionEx5throw {

	public static void main(String[] args) {
		try {
			first();
		} catch (Exception e) {
			System.out.println("숫자만 가능합니다");
			e.printStackTrace();
		}

	}

	private static void first() throws Exception {
		System.out.println("first 메서드");
		second();
	}

	private static void second() throws Exception {

		System.out.println("second 메서드");
		try {
			System.out.println(Integer.parseInt("abc")); // NumberFormatException 예외발생
		} catch (RuntimeException e) {
			System.out.println("second 메서드에서 예외처리");
			throw e; // 예외 재발생 main도 알수있게 throw로 예외발생시킴. second메서드에서 예외처리, 숫자만 가능합니다까지 출력
		}
	}
}
