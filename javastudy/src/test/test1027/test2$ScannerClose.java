package test.test1027;

import java.util.Scanner;

/*
1.  다음은 주어진 문자열(value)이 숫자인지를 판별하는  프로그램을 작성하시오.
  String 함수 charAt(i), length() 을 사용함.
  Scanner의 nextLine() 이용하기 문자열 받는메서드
  [결과]
숫자만 입력하세요
123
123는 숫자 입니다.
  
  [결과]
숫자만 입력하세요
123@12
123@12는 숫자가 아닙니다.
 */
public class test2$ScannerClose {

	public static void main(String[] args) {

		// Scanner의 next() : 공백을 기준으로 한 단어 또는 한 문자씩 입력받는다. 버퍼에 입력된 문자나 문자열에서 공백 전까지의 단어를
		// 읽는다.

		// Scanner의 nextLine() : 개행된 문장까지 입력받는다.
		// sc.close(); : 스캐너를 닫아줌

		// nextLine() 전에 next,nextInt를 썼다면 엔터가 킵해져있는 상태고 nextLine은 개행까지 입력받기때문에
		// 엔터를 출력해서 nextLine에 입력값을 받기도전에 Scanner가 종료된다. 이럴때 next와 nextLine() 사이에
		// nextLine() 을 하나 더써주면 다음 nextLine에 값을 입력할수있다
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자만 입력하세요");
		String num = sc.nextLine(); // 공백까지 입력받기위해 nextLine을씀
		char[] charArr = num.toCharArray(); // char배열에 String을 char로 변환 저장
		int count = 0;

		for (int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i]);
			if (charArr[i] >= '0' && charArr[i] <= '9') {
				count++;
			}
		}

		if (count == charArr.length) {
			System.out.println(": 숫자입니다.");
		} else {
			System.out.println(": 숫자가 아닙니다.");
		}
		sc.close();
	}

}
