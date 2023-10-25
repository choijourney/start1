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
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < n; j += 2)
				System.out.print("*");

		}
		System.out.println(" ");
	}

}
