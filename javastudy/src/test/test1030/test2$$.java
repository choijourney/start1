package test.test1030;

import java.util.Scanner;

/*
 * 2차원 배열을 이용하여 모래시계 출력하기인데 배열 없이 만들어봄
 * 
 * [결과]
 * 삼각형의 길이를 홀수로 입력하세요
 * 5
  *****
   ***
    *
   ***
  *****  
 */
public class test2$$ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("길이를 홀수로 입력하세요");
		int num = scan.nextInt();

		for (int i = 0; i <= num / 2; i++) { // 위삼각형 세줄
			for (int j = 0; j < num; j++) {
				if (j >= i && j < num - i)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = num / 2 + 1; i < num; i++) { // 아래삼각형 두줄
			for (int j = 0; j <= i; j++) {
				if (j >= num - i - 1) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}