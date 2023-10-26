package chap4;

import java.util.Scanner;

// 삼각형의 높이를 입력하세요

public class Exam9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int n = sc.nextInt(); // 3

		// 방법 1.
		int i, j, k;
		int s = 0;

		for (i = 1; i <= n; i++) {
			s += i; // s=6
		}

		for (j = 1; j <= n; j++) {
			for (k = 1; k <= n; k++) {
				if (j <= k)
					System.out.print(s-- + "\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}

		// 방법 2. 위에서 n의 총합인 s=6을 구해놓았다
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {

			}
		}

	}

}
