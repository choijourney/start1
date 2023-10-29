package test1027;

import java.util.Scanner;

/*
 * 10진수를 2,8,10,16 진수로 변경하기
 * [결과]
10진수 값을 입력하세요
16

16의 2진수 :10000
16의 8진수 :20
16의 10진수 :16
16의 16진수 :10

*/
public class test3$ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10진수를 입력해주세요.");
		int number = sc.nextInt();
		int num = number;

		int binary[] = new int[6];
		int i = 0;
		System.out.print(num + "의 2진수:");

		while (num > 0) { // num이 0보다 큰동안 num을 나누기
			binary[i++] = num % 2;
			num /= 2;
		}

		for (int j = i - 1; j >= 0; j--) { // 윗줄에서 i++가된상태라서 i-1을 해준다
			System.out.print(binary[j]);
		}

		System.out.println();
		// 8진수
		int octal[] = new int[6];
		i = 0; // index
		num = number;
		System.out.print(num + "의 8진수:");
		while (num > 0) {
			octal[i++] = num % 8;
			num /= 8;
		}

		for (int j = i - 1; j >= 0; j--) {
			System.out.print(octal[j]);

		}

		// 10진수
		System.out.println();
		System.out.println(number + "의 10진수:" + number);

		// 16진수
		num = number;
		i = 0;
		int hex[] = new int[8];
		System.out.print(num + "의 16진수:");

		while (num > 0) {
			hex[i++] = num % 16;
			num /= 16;
		}

		for (int j = i - 1; j >= 0; j--) {
			System.out.print(hex[j]);
		}

	}
}
