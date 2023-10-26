package test1025;

import java.util.Scanner;

public class test7 {

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
