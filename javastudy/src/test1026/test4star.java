package test1026;

import java.util.Scanner;

/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			
	8	7	6		
5	4	3	2	1	
 
*/
public class test4star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");
		int height = sc.nextInt();
		int data = height * 3;

		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= height - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print(data);
				data--;
			}
			System.out.println();

		}

		// 방법 2.

		int odd = height * 3;
		int b = height * 2 - 1; // 바닥의 개수 5
		int m = b / 2; // 중간값
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < b; j++) { // j는 5번 가로를 반복해야함

				if (j >= m - i && j <= m + i) {
					System.out.print(odd + "\t");
					odd--;

				} else
					System.out.print("\t");

			}
		}

		System.out.println();

//		// T방식
//
//		int bottom = height * 2 - 1;
//		int data1 = 0; // 숫자의 시작값
//		for (int i = bottom; i >= 1; i -= 2) {
//			data1 += i;
//		}
//		int m1 = bottom / 2;
//		for (int i = 0; i < height; i++) {
//			for (int j = 0; j < bottom; j++) {
//				if (j >= m1 - i && j <= m1 + i)
//					System.out.print(data1-- + "\t");
//				else
//					System.out.print("\t");
//			}
//			System.out.println();
//		}

//		System.out.println("---------");
//		int b = height * 2 - 1; // 바닥의 개수 5
//		int m = b / 2; // 중간값
//		for (int i = 0; i < height; i++) {
//			for (int j = 0; j < b; j++) { // j는 5번 가로를 반복해야함
//				if (j >= m - i && j <= m + i) {
//					System.out.print("*");
//				} else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}

	}

}
