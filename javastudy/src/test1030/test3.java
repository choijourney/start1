package test1030;

import java.util.Scanner;

/*
배열의 크기를 홀수로 입력하세요
5
17	16	15	14	13	
 	12	11	10	 	
 	 	9	 	 	
 	8	7	6	 	
5	4	3	2	1	
 */
public class test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 길이를 홀수로 입력하세요");
		int num = sc.nextInt();
		int max = num * 2 - 1;
		// 처음 숫자 구하기 1~num 까지 더하고 +2
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		int data = sum + 2;

		int[][] pattern = new int[num][num];
		int currentNumber = 17;

		for (int i = 0; i < num; i++) {
			for (int j = i; j < num - i; j++) {
				pattern[i][j] = currentNumber--;
			}
		}

		// 패턴 출력
		for (int i = 0; i < pattern.length - 1; i++) {
			for (int j = 0; j < num; j++) {
				if (pattern[i][j] == 0) {
					System.out.print("\t"); // 빈 공간 출력
				} else {
					System.out.print(pattern[i][j] + "\t"); // 숫자 출력
				}
			}
			System.out.println(); // 줄 바꿈
		}

		// 출력
//		for (int[] ar : arr) {
//			for (int a : ar) {
//				System.out.print(a);
//			}
//			System.out.println();
//		}

//		for (i = 0; i < num - 1; i++) { // 0~1 반복 두줄
//		for (j = 0; j < i; j++) {
//			arr[i][j] = ' ';
//		}
//		for (k = 0; k < minus * 2 - 1; k++) {
//			arr[i][k] = data--;
//		}
//
//		minus--;
//		System.out.println();
//	}
	}

}
