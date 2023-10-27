package chap5array;

import java.util.Scanner;

// 10진수를 입력받아 8진수로 변환하기
public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("8진수로 변환할 10진수를 입력하세요");
		int num = sc.nextInt();
		int divnum = num;
		int index = 0;

		int[] octal = new int[12];
		while (divnum > 0) {
			octal[index++] = divnum % 8;
			divnum /= 8;
		}
		System.out.print("10진수를 8진수로 : ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(octal[i]);
		}

		System.out.println();
		System.out.println(Integer.toOctalString(num));

	}

}
