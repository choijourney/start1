package test1024;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		/*
		 * 화면에서 두수를 입력받아서 더큰수를 출력하기
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 두번 입력해주세요");
		int num = sc.nextInt();
		int num1 = sc.nextInt();

		int number = (num < num1) ? num1 : num;
		System.out.println(number);
		System.out.printf("%d , $d 둘 중 더 큰 수는 : %d ", num, num1, number);
	}

}
