package chap4IFLoopSwitch;

import java.util.Scanner;

// 삼각형의 높이를 입력받아서 *로 삼각형 출력하기
// [결과]
// 삼각형의 높이 : 3

public class Exam6star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 삼각형 만들기
		System.out.println("삼각형 높이를 입력해주세요");
		int num = sc.nextInt();

		System.out.println("3번 삼각형");
		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

		// 거꾸로 삼각형 만들기
		System.out.println("2번 삼각형");
		for (int i = num; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 삼각형을 오른쪽으로
		System.out.println("3번 삼각형");
		for (int i = num; i >= 1; i--) {

			for (int j = 1; j <= num; j++) {
				if (i <= j) {
					System.out.print("*");
				} else
					System.out.print(" ");

			}
			System.out.println();
		}

		// 오른쪽 삼각형을 거꾸로
		System.out.println("4번 삼각형");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}

	}

}
