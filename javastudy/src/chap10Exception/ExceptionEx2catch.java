package chap10Exception;

// 다중 catch구문
// - 한개의 try 블럭에 여러개의 catch 블럭이 존재
//  => try 블럭에서 발생 가능한 예외 종류에 따라 다른 예외처리 가능
// - 상위 예외클래스(Exception)은 catch 구문의 하단에 배치해야함.

// Throwable > Exception > RuntimeException > ArithmeticException,  NumberFormatException
//		..... IoException, SQLException...

// 자바에서는 예외처리 필수. 단 RuntimeException과 그 하위클래스는 예외처리 생략가능
public class ExceptionEx2catch {

	public static void main(String[] args) {
		System.out.print(1);
		try {
			System.out.print(2);
			System.out.print(3); // ArithmeticException 예외발생
//			System.out.print(args[0]); // ArrayIndexOutOfBoundsException 예외발생
//			System.out.print(Integer.parseInt("abc")); // NumberFormatException 예외발생
			String str = null;
			System.out.println(str.trim()); // NullPointerException
			System.out.print(4);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누지 마세요.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터를 입력하세요");
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		} catch (RuntimeException e) { // 다중catch문일때 제일 하단에 배치해야함
			e.printStackTrace(); // 어디서 오류났는지 알려줌
			System.out.println("오류가 발생했습니다. 전산부로 연락하세요");
		} catch (Exception e) { // 다중catch문일때 제일 하단에 배치해야함
			e.printStackTrace(); // 어디서 오류났는지 알려줌
			System.out.println("오류가 발생했습니다. 전산부로 연락하세요");
		}
	}

}
