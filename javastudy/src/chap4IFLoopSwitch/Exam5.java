package chap4IFLoopSwitch;

import java.util.Scanner;

// 화면에서 자연수를 입력받아서 각 자리수의 합을 구하기
// [결과]
// 자연수 입력
// 123
// 1234의 자리수 합 : 6
public class Exam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 입력:");
		int num = sc.nextInt();

		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;

		}
		System.out.println(sum);
	}

}
