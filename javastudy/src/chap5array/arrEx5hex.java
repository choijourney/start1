package chap5array;

import java.util.Scanner;

// 10진수를 입력받아 16진수로 변환하기
// int[] 배열 사용불가, 0123456789ABCDEF 데이터필요. char필요

public class arrEx5hex {

	public static void main(String[] args) {
		// toCharArray : char[] <- 문자열을 char로 변환해줌
		char[] data = "0123456789ABCDEF".toCharArray();
		char[] hex = new char[8]; // 변환된 16진수 데이터 저장
		System.out.println("16진수로 변환할 10진수 입력");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 17
		int divnum = num;
		int index = 0;
		while (divnum > 0) {
			hex[index++] = data[divnum % 16];
			divnum /= 16;
		}
		System.out.print(num + "의 16진수: ");
//		for (int i = index - 1; i >= 0; i--)	// index값부터 출력시켰기때문에 초기값이 안보임
		for (int i = hex.length - 1; i >= 0; i--)
			System.out.print(hex[i]);
		System.out.println();

		// 클래스를 이용한 16진수 변환
		System.out.println(Integer.toHexString(num));
	}

}
