package test.test1024;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		// 반지름을 입력받아 원의 둘레와 면적을 소수점이하 2자리로 출력하기

		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력해주세요");
		int num = sc.nextInt();

		double d = 3.141592;
		double circle = d * num * num;
		double perimeter = d * num * 2;

		System.out.printf("원의 면적은 %.2f", circle);
		System.out.println();
		System.out.printf("원의 둘레는 %.2f", perimeter);

	}

}
