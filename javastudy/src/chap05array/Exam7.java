package chap05array;

import java.util.Scanner;

// 오른쪽 역삼각형 모양으로 숫자 찍기 (내림차순)
public class Exam7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");
		int num = sc.nextInt();

		// 첫번째 숫자 값 구하기 1~num까지 수를 더하면 첫번쨰 숫자.
		int max = 0;
		for (int i = 1; i <= num; i++) {
			max += i;
		}
		int data = max;

		// 역삼각형 모양 숫자 찍기
		for (int i = 0; i < num; i++) { // 공백찍기
			for (int k = 0; k < i; k++) {
				System.out.printf("%3c", ' ');
			}

			for (int j = i; j < num; j++) { // 숫자찍기
				System.out.printf("%3d", data--);

			}
			System.out.println();
		}

		// T방식
		max = 0;
		for (int i = 1; i <= num; i++) {
			max += i;
		}
		data = max;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i > j) // %3c : char 문자 3자리로 출력.
					System.out.printf("%3c", ' '); // 공백 출력
				else if (i <= j)
					System.out.printf("%3d", data--); // 숫자 출력
			}
			System.out.println();
		}
	}
}