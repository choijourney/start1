package chap4;

import java.util.Scanner;

// 점수를 입력받아서
// 1. 양수 / 음수 /영  출력
// 2. 짝수 / 홀수 출력

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("영");
		}

		// 짝수홀수
		if (num % 2 == 0 && num != 0) {
			System.out.println("짝수");
		} else if (num == 0) {
			System.out.println("영");
		} else {
			System.out.println("홀수");
		}

	}

}
