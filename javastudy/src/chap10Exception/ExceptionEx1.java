package chap10Exception;

// 예외처리 : 발생된 예외를 정상화 하는 기능
// try 블럭 : 예외 발생 가능성이 있는 문장들의 모임. 예외 발생시 catch블럭을 실행 
// catch 블럭: try블럭에서 예외발생시 실행되는 영역
//			반드시 try구문과 함께 사용해야함
public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
//			System.out.println(args[0]); //ArrayIndexOutOfBoundsException 예외발생
			System.out.println(1 / 0); // ArithmeticException 예외발생
			System.out.println("프로그램 종료");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터를 입력하세요");
		}

	}

}
