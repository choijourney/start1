package test.test1026;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
3
*****
 ***
  *
 
 */
public class test5star {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");

		int t = sc.nextInt();

		// 거꾸로 삼각형

		int p = t;

		int i, j, k;
		for (i = 1; i <= t; i++) {
			for (k = 0; k < i - 1; k++) { // k는 println후에 0부터 다시시작
				System.out.print(" ");
			}
			for (j = 0; j < p * 2 - 1; j++) {
				System.out.print("*");
			}
			p--;
			System.out.println();
		}

		// 방법 2.
//		int two = five / 2;
//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < five - i; j++) {
//				if (j >= i) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		int len = sc.nextInt();
//		int bottom = len * 2 - 1;
//		int m = bottom / 2;  //여기선 안필요함
//		for (int i = 0; i < len; i++) {
//			for (int j = 0; j < bottom - i; j++) {
//				if (j >= i)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}

	}

}
