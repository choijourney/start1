package test1026;

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
public class test6 {

	public static void main(String[] args) {
		// 짝수인지 검사
		int num;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("삼각형의 높이를 홀수로 입력ㅎㅏ세요");
			num = sc.nextInt();
			if (num % 2 == 0) {
				System.out.println("홀수로 입력하세요");

			} else
				break;
		}

		// 맨위 두줄 5 4 만듦
		int i, j, k;
		int a = num;

		for (i = 1; i <= num - 1; i++) {
			for (j = 0; j < i - 1; j++) {
				System.out.print(" ");

			}
			for (k = 0; k < a * 2 - 1; k++) {

				System.out.print("*");
			}
			a--;
			System.out.println();
		}

		// 아래 삼각 트리
		for (i = 1; i <= num; i++) {
			for (j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
