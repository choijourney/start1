package test1027;

import java.util.Scanner;

/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */

public class test1$ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		String num = sc.next();

		char[] charArr = num.toCharArray(); // String을 char배열로 변환
		char[] reverse = new char[charArr.length];
		int index = 0;

		for (int i = charArr.length - 1; i >= 0; i--) { // reverse배열에 charArr배열의 값을 거꾸로 저장
			reverse[index++] = charArr[i];
		}

		int count = 0;
		for (int i = 0; i < reverse.length; i++) { // 대칭수인지 확인
			System.out.print(charArr[i]);
			if (reverse[i] == charArr[i]) {
				count++;
			}
		}

		if (count == reverse.length) {
			System.out.print(": 대칭수 입니다");
		} else {
			System.out.println(": 대칭수가 아닙니다");
		}

	}
}