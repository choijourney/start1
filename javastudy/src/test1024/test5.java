package test1024;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		/*
		 * 밑변과 높이를 입력받아 삼각형의 넓이를 출력하기. 소숫점을 표시 [결과] 밑변의 길이 10 높이의 길이 20
		 * 
		 * 넓이=10*20 / 2
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("밑변의 길이");
		int width = sc.nextInt();
		System.out.println("높이의 길이");
		int height = sc.nextInt();
		double d = width * height / 2;
		System.out.println("넓이 = " + width + "*" + height + " / " + "2 = " + d);

		// 선생님방법
		System.out.println(width * height / 2.0);
	}

}
