package chap5array;

import java.util.Scanner;

// 10진수를 입력받아 8진수로 변환하기
public class Exam2Octal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("8진수로 변환할 10진수를 입력하세요");
		int num = sc.nextInt(); // 10진수 입력
		int divnum = num; // 10진수 값 복사
		int index = 0;

		int[] octal = new int[12]; // 8진수 배열 생성
		while (divnum > 0) { // 10진수가 0보다 클 동안 나누기함
			octal[index++] = divnum % 8; // octal[0] = 십진수를 8로나눈 나머지 저장
			divnum /= 8; // 10진수를 8로 나눔
		}

		System.out.print("10진수를 8진수로 : ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(octal[i]);
		}

		System.out.println();
		System.out.println(Integer.toOctalString(num));

	}

}
