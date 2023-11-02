package test.test1026;

import java.util.Scanner;

/*

삼각형의 높이를 홀수로 입력하세요
5
*****
 ***
  *
 ***
*****


 */
public class test6$ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이를 홀수로 입력하세요");
		int num = sc.nextInt();
		int five = num * 2 - 1;

		// 위삼각형 두줄만
		for (int i = 1; i <= 2; i++) {
			for (int j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < five; k++) {
				System.out.print("*");
			}
			System.out.println();
			five -= 2;
		}
		// 아래삼각형 세줄

		for (int i = 1; i <= num; i++) {
			for (int k = 0; k < num - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 다른 방법

		int maxLine = num * 2 - 1; // 맨위 삼각형 두줄만
		for (int i = 0; i < num - 1; i++) {
			for (int j = 0; j < maxLine - i; j++) {
				if (j >= i) { // j는 0~4까지 반복
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// 아래 삼각형
		int half = (num * 2 - 1) / 2;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < maxLine; j++) {
				if (j >= half - i && j <= half + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
