package test.test1030;

import java.util.Scanner;

// 모래시계 별 만들기 배열이용하기
public class test2$ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("길이를 홀수로 입력하세요"); // 5 라고가정
		int num = scan.nextInt();

		char[][] arr = new char[num][num];

		for (int i = 0; i < num - 2; i++) { // 위삼각형 3줄
			for (int j = i; j < num - i; j++) {
				arr[i][j] = '*';
			}
		}

		int half = num / 2;
		// 아래삼각형 2줄
		for (int i = half + 1; i < num; i++) { // 인덱스3,4 두줄
			for (int j = num - i - 1; j <= i; j++) { // j는 1이됐다가 0이 돼야하고 , i가 3이었다가 4가되니까 i와 범위가 같아야함
				arr[i][j] = '*';
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
