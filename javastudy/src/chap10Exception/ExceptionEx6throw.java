package chap10Exception;

// throw : 예외 강제발생
public class ExceptionEx6throw {

	public static void main(String[] args) {
//		throw new RuntimeException("예외 강제 발생"); // 예외객체 생성자 /RuntimeException 예외처리 생략가능
		try {
			throw new Exception("예외 강제 발생"); // 예외처리 필수 try catch구문을쓰거나 main옆에 throws Exception쓰면됨
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage()); // 예외 강제 발생 출력

		}
	}

}
