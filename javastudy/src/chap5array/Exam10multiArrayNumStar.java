package chap5array;

import java.util.Scanner;

// 2차원 배열의 값을 입력받아 다음과 같은 내용을 출력하기
// 배열의 개수를 입력하세요
// 5
// 1
// 2  3
// 4  5  6
// 7  8  9  10
// 11 12 13 14 15
public class Exam10multiArrayNumStar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 길이를 입력하세요");
		int num = sc.nextInt();

		int[][] arr = new int[num][];
		int n = 0;

		for (int i = 0; i < num; i++) {
			arr[i] = new int[i + 1]; // 1차원 배열의 객체생성 (=2차원배열생성)
		} // 1차원배열이 [0]일때 2차원배열을 [1] , [1][2] , [2][3] 으로 객체를 생성하기위함.

		for (int i = 0; i < arr.length; i++) { // 배열에 값을저장
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ++n;
				System.out.printf("%5d", arr[i][j]); // 출력
			}
			System.out.println();
		}

		System.out.println("arr배열 출력하기");
		// arr 출력하기
		for (int[] ar : arr) {
			for (int a : ar) {
				System.out.printf("%5d", a);
			}
			System.out.println();
		}
	}

}
