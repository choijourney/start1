package chap2;

// 특수문자 : escape문자
// 특정의미를 부여하는 문자
public class varEx3 {

	public static void main(String[] args) {
		String str = "홍길동이 말했습니다. \"안녕\"";
		System.out.println(str);
		char ch = '\'';
		System.out.println(ch);
		System.out.println("홍길동\t김삿갓\t이몽룡"); // \t : tab 표현
		System.out.println("홍길동\n김삿갓\n이몽룡"); // \n : new line 표현

		ch = '\\'; // \ 역슬래시 하나 표현

		// c:\20231023 문자열 출력하기
		System.out.println("c:\\20231023");

		ch = '\u0041'; // 16진수 유니코드
		System.out.println(ch); // A

	}
}