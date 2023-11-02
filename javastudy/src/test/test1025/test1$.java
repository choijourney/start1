package test.test1025;

/*
 * 1. ch 변수의 문자가 대문자인 경우는 소문자로, 소문자인 경우는 대문자로 숫자인 경우는 20을 더한 값을 출력하기 그외의 문자는 기타
 * 문자 를 출력하세요 [결과] A : a b : B 1 : 21 - :기타문자 1 의 아스키코드는 49
 */
public class test1$ {

	public static void main(String[] args) {
		char ch = '9'; // 소문자 -32 는 대문자 소문자 a 는 97 대문자A는 65

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println((char) (ch + 32));
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println((char) (ch - 32));
		}

		else if (ch >= '0' && ch <= '9') {
			System.out.println(ch - '0' + 20); // '0'은 48
		} else {
			System.out.println("기타 문자");
		}
	}

}
