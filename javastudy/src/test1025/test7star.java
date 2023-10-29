package test1025;

import java.util.Scanner;

public class test7star {

	public static void main(String[] args) {
		/*
		 * 삼각형의 높이를 입력받아 다음 삼각형을 출력하기 [결과] 삼각형의 높이 : 3
		 * 
		 ***
		 *****
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 써주세요");
		int n = sc.nextInt();
		int i, j, k;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n - i; j++) { // j <= n- j 는 안됨. 그래서 오류
				System.out.print(" ");
			}
			for (k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// T 방식
		System.out.print("삼각형의 높이 :");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int b = h * 2 - 1; // 바닥의 *의 갯수
		int m = b / 2; // 중간값
		for (i = 0; i < h; i++) {
			for (j = 0; j < b; j++) {
				if (j >= m - i && j <= m + i) // 인덱스 0 1 2 3 4 일때 별을 찍도록.
					System.out.print("*"); // 인덱스로 처음에 2자리에 *하나찍고 1 2 3 자리에 찍고
				else // 012345 자리에 찍도록 만든식.
					System.out.print(" ");
			}
			System.out.println();
		}

//		// 오른쪽 삼각형 별 만들기
//		int i, j, k;
//
//		for (i = 1; i <= n; i++) {
//			for (j = 1; j <= n - i; j++) {
//				System.out.print(" ");
//			}
//			for (k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		

	}

}
