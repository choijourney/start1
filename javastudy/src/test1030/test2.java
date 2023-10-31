package test1030;

import java.util.Scanner;

/*
 * 2차원 배열을 이용하여 모래시계 출력하기
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
public class test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("길이를 홀수로 입력하세요");
		int num = scan.nextInt();
		char[][] matrix = new char[num][num];
		// 위쪽 역삼각형부분의 * 채우기 (세줄)
		for (int i = 0; i <= matrix.length / 2; i++) { // 세줄이니까 0,1,2 까지 세번반복
			for (int j = i; j < matrix.length - i; j++) { // j=0; j<5-0; 0,1,2,3,4 반복
				matrix[i][j] = '*';
			}
		}
		// 아래쪽 삼각형 부분의 * 채우기 (두줄)
		for (int i = matrix.length / 2 + 1; i < matrix.length; i++) { // i=3; i<5 두줄 i의 인덱스는 3,4
			for (int j = matrix.length - i - 1; j <= i; j++) { // 5-3-1 =1; j<=i; i가3이니까 j는 1,2,3 자리에 *찍음
				matrix[i][j] = '*'; // i=4 가되면 5-4-1= 0 ; j<=i; i가 4니까 0,1,2,3,4 자리에 * 찍음
			}
		}
		// 모래시계 출력하기
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		// 개선된 for 구문으로 출력하기
		for (char[] arr : matrix) {
			for (char a : arr) {
				System.out.print(a);
			}
			System.out.println();
		}

	}

}
