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
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 길이를 홀수로 입력하세요");
		int num = sc.nextInt();
		int maxLine = num * 2 - 1;

		char[][] arr = new char[num][num * 2 - 1];

		int half = num * 2 - 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < maxLine - i; j++) { // 5 4 3 길이가 줄어들게 maxLine-i
				if (j >= i) { // j와 i가 같을때 X자 그릴때처럼 i가 0, j가0, i1,j1 일때 별이 그려진다.
					arr[i][j] = '*'; // j가 i와 같거나 i보다 클때 *을 찍으면 된다
				} else {
					arr[i][j] = ' ';
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		// 아래 삼각형 두줄
		char[][] arr2 = new char[num - 1][half];
		for (int i = 0; i < num - 1; i++) {
			for (int j = 0; j < num - i - 2; j++) {
				arr2[i][j] = ' ';
			}
			for (int j = 0; j < num; j++) {

			}
		}

	}

}
