package chap05array;

import java.util.Scanner;

//사각형의 높이를 홀수로 입력하세요. X를 X자로 만들기

public class Exam9$ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형의 높이를 홀수로 입력하세요.");
		int num = sc.nextInt();

		char[][] arr = new char[num][num];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j || i + j == num - 1) {
					arr[i][j] = 'X';
				} else {
					arr[i][j] = ' ';
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		for (char[] a : arr) {
			for (char r : a) {
				System.out.print(r);
			}
			System.out.println();
		}
	}

}
