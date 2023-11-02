package test.test1026;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
3
*****
 ***
  *
 
 */
public class test5$ {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");
		int num = sc.nextInt();
		int five = num * 2 - 1;
		int minus = five;

		for (int i = 1; i <= num; i++) {

			for (int k = 0; k < i - 1; k++) { // 공백이 앞에있어야 공백이찍힌다
				System.out.print(" ");
			}
			for (int j = 0; j < minus; j++) {
				System.out.print("*");
			}
			minus -= 2;
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
//		int m = bottom / 2;
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
