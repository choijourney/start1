package chap5array;

import java.util.Scanner;

//오른쪽 역삼각형 모양으로 숫자 찍기 (내림차순) 
//삼각형 높이를 입력받기 5면 15부터 숫자시작
public class Exam6$ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");
		int num = sc.nextInt();

		// 1~num까지 숫자를 더하면 처음숫자
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}

		int[][] arr = new int[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = i; j < num; j++) {
				arr[i][j] = sum--;
				// 여기서 arr을 출력하면 위식에서 정해놓은 인덱스때문에 원하는모양이안나옴
			}
		}

		for (int[] ar : arr) {
			for (int a : ar) {
				if (a == 0) {
					System.out.printf("%3c", ' ');
				} else
					System.out.printf("%3d", a);
			}
			System.out.println();
		}
	}

}
