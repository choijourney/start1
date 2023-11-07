package chap10Exception;

// finally 블럭 : try 블럭에서 정상처리/예외발생 모두 실행되는 블럭
// return으로 메서드 종료를 시켜도 finally 구문은 실행하고 종료된다

//정상처리 :12356 
// 2/0예외 :1456
// 2/0예외 return :145
public class ExceptionEx3finally {

	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.println(2 / 0);
			System.out.print(2);
			System.out.print(3);
		} catch (Exception e) {
			System.out.print(4);
			return; // 메서드 종료
		} finally {
			System.out.print(5);
		}
		System.out.println(6);
	}

}
