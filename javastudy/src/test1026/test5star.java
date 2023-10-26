package test1026;

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
		int c = t;

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

		// 트리 삼각형
//		int e, r, w;
//
//		for (e = 1; e <= t; e++) {
//			for (w = c - 1; w >= 1; w--) {
////				for (w = 1; w <= t - i; w++) 이렇게해도됨
//				System.out.print(" ");
//			}
//
//			for (r = 1; r <= e * 2 - 1; r++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			c--;
//		}

//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("삼각형의 높이를 입력하세요");
//		int t = sc.nextInt();
//		int p = t;
//
//		int i, j, k;
//		for (i = 1; i <= t; i++) {
//			for (k = 0; k < i - 1; k++) {
//				System.out.print(" ");
//			}
//			for (j = 0; j < p * 2 - 1; j++) {
//				System.out.print("*");
//			}
//			p--;
//			System.out.println();
//		}
	}

}
