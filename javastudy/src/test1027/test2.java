package test1027;

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
public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자만 입력하세요");
		int n = sc.nextInt();
		char c = (char) n;
		char[] cArr;

		System.out.println(c);

//		if (c >= '0' && c <= '9') {
//			System.out.println("숫자입니다.");
//		} else
//			System.out.println(c + "는 숫자가 아닙니다.");

	}

}
