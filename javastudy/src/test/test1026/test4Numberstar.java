package test.test1026;

import java.util.Scanner;

/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			
	8	7	6		
5	4	3	2	1	
 
*/
public class test4Numberstar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");
		int height = sc.nextInt();
		int data = height * height; // 꼭지점 처음 숫자를 구하는식

//		for (int i = 1; i <= height; i++) {
//
//			for (int j = 1; j <= height - i; j++) { // 공백만들기
//				System.out.print("\t");
//			}
//			for (int k = 1; k <= i * 2 - 1; k++) { // 숫자만들기
//				System.out.print(data-- + "\t");
//			}
//			System.out.println();

//		}

		// 방법 2.

		int odd = height * height;
		int b = height * 2 - 1; // 바닥의 개수 5
		int m = b / 2; // 인덱스2를 만들고 2가 가운데니까 2부터 숫자를 하나 찍을거임
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < b; j++) { // j는 5번 가로를 반복해야함

				if (j >= m - i && j <= m + i) { // 처음에 가운데인덱스 2자리에 처음숫자 하나를 찍고
					System.out.print(odd-- + "\t");// 인덱스 123 자리에 숫자 세개를 찍고, 인덱스 01234 자리에 숫자 다섯개를 찍는다

				} else
					System.out.print("\t");

			}
			System.out.println();
		}

//		// T방식
//
//		int bottom = height * 2 - 1;
//		int data1 = 0; 		// 숫자의 시작값을 구하기위한 식. 예를들어 height이 5일때 5+3+1=9 9가 첫숫자이다 
//		for (int i = bottom; i >= 1; i -= 2) {	// 7일때 7+5+3+1= 16
//			data1 += i;
//		}

//		int m1 = bottom / 2; 	// 삼각형 모양을 만들기 위한 식.
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
