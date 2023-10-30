package chap5array;

import java.util.Scanner;

//오른쪽 역삼각형 모양으로 숫자 찍기 (내림차순) \
// 삼각형 높이를 입력받기 5면 15부터 숫자시작
public class Exam6ArrayNumStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");
		int len = sc.nextInt();
		int data = 0; // 숫자 시작부분 저장
		for (int i = 1; i <= len; i++) { // 1~ len까지의 합이 시작숫자값
			data += i;
		}

		// 높이와 같은 행과열을 가진 배열 matrix생성하기
		int[][] matrix = new int[len][len];
		// 숫자를 각 자리수에 저장하기
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				matrix[i][j] = data--; // 0행 0열에 data를 찍고 1행 1열에 data를 찍고 2행 2열에 data를 찍는과정을 5번하면됨.
			}
		}

		// forEach문
		for (int[] arr : matrix) {
			for (int a : arr) {
				if (a == 0) {
					System.out.printf("%3c", ' '); // 0을 세칸에 __' ' 바꿈
				} else
					System.out.printf("%3d", a); // 숫자를 _15 로바꿈
			}
			System.out.println();
		}

		// for문
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				if (matrix[i][j] == 0) {
//					System.out.printf("%3c", ' ');
//				} else {
//					System.out.printf("%3d", matrix[i][j]);
//				}
//			}
//			System.out.println();
//		}

	}

}
