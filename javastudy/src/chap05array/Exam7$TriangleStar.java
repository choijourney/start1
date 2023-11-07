package chap05array;

import java.util.Scanner;

//오른쪽 역삼각형 모양으로 숫자 찍기 (내림차순) 배열없이
public class Exam7$TriangleStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");
		int num = sc.nextInt();
		// 처음숫자 만들기
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		// 방식1
//		for (int i = 0; i < num; i++) {
//			for (int k = 0; k < i; k++) {
//				System.out.printf("%3c", ' ');
//			}
//
//			for (int j = i; j < num; j++) {
//				System.out.printf("%3d", sum--);
//			}
//			System.out.println();
//		}
		// 방식2

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j >= i) {
					System.out.printf("%3d", sum--);
				} else {
					System.out.printf("%3c", ' ');
				}
			}
			System.out.println();
		}

	}

}
