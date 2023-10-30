package chap5array;

import java.util.Scanner;

//오른쪽 역삼각형 모양으로 숫자 찍기 (내림차순) 
//삼각형 높이를 입력받기 5면 15부터 숫자시작
public class Exam6$ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");
		int len = sc.nextInt();

		// 첫 숫자 만들기
		int sum = 0;
		int data = 0;
		for (int i = 1; i <= len; i++) {
			sum += i;
		}
		data = sum;

		int[][] arr = new int[len][len];
		// 역삼각형 만들기
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				arr[i][j] = data--;
			}
		}

		for (int[] a : arr) {
			for (int result : a) {
				if (result == 0) {
					System.out.printf("%3c", ' ');
				} else {
					System.out.printf("%3d", result);
				}
			}
			System.out.println();
		}
	}

}
