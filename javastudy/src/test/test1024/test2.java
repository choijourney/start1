package test.test1024;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		/*
		 * 10부터 99사이의 두자리 자연수를 입력받아 입력된 수 보다 크거나 같은 10의 배수를 구하기 10의 배수에서 입력된 수를 뺀값을 출력하기
		 * [결과] 10부터 99사이의 두자리 자연수를 입력하세요 24 6 : 30 - 24
		 * 
		 * 10부터 99사이의 두자리 자연수를 입력하세요 20 0 : 20 - 20
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("10부터 99 사이의 두자리 자연수를 입력하세요");
		int nums = sc.nextInt();

		int num2 = ((nums / 10) * 10 + 10) - nums;

		int num3 = (nums % 10 != 0) ? num2 : (nums - nums);
		System.out.println(num3);

		// 선생님방법
		System.out.println("두자리 자연수를 입력하세요");
		int num = sc.nextInt();
		int num10 = (num % 10 == 0) ? num : ((num / 10 + 1) * 10);
		System.out.println((num10 - num) + " : " + num10 + " - " + num);
	}

}
