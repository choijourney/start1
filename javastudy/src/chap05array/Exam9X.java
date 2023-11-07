package chap05array;

import java.util.Scanner;

// 사각형의 높이를 홀수로 입력하세요. X를 X자로 만들기
public class Exam9X {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형의 높이를 홀수로 입력하세요.");
		int num = sc.nextInt();

		char[][] matrix = new char[num][num];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j || i + j == num - 1) { // 인덱스때문에 num-1
					matrix[i][j] = 'X';
				} else {
					matrix[i][j] = ' ';
				}
				System.out.print(matrix[i][j]); // 바로출력해도됨
			}
			System.out.println();
		}

		for (char[] x : matrix) { // 반복문을 이용해출력
			for (char r : x) {
				System.out.print(r);
			}
			System.out.println();
		}
	}

}
