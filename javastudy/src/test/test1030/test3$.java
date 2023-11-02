package test.test1030;

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
public class test3$ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("길이를 홀수로 입력하세요");
		int num = scan.nextInt();

		int[][] arr = new int[num][num];

		int sum = 0; // 처음숫자구하기
		for (int i = 1; i <= num; i += 2) {
			sum += i;
		}
		int data = sum * 2 - 1; // 1+3+5 =9 *2 -1 =17

		// 위삼각형 세줄
		for (int i = 0; i < num; i++) {
			for (int j = i; j < num - i; j++) {
				arr[i][j] = data--;
			}
		}

		// 아래삼각형 두줄
		for (int i = num / 2 + 1; i < num; i++) {
			for (int j = num - i - 1; j <= i; j++) {
				arr[i][j] = data--;
			}
		}

		// 출력
		for (int[] ar : arr) {
			for (int a : ar) {
				if (a == 0) {
					System.out.print("\t");
				} else
					System.out.print(a + "\t");
			}
			System.out.println();
		}
	}

}
