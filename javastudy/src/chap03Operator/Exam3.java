package chap03Operator;

import java.util.Scanner;

// 화면에서 3자리 자연수를 입력받아 100자리 미만을 버리고 출력하기
// [결과]
// 세자리 자연수를 입력하세요
// 321
// 300

public class Exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세자리 자연수를 입력하세요");
//		int num = sc.nextInt();
//		System.out.println(num - (num % 100));

		int num = sc.nextInt();
		int result = num / 100 * 100;
		System.out.println(result);

	}

}
