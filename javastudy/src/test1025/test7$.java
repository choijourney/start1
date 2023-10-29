package test1025;

import java.util.Scanner;

/*
 * 삼각형의 높이를 입력받아 다음 삼각형을 출력하기 [결과] 삼각형의 높이 : 3
   * 
  ***
 *****
 * 
 */
public class test7$ {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이 :");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
