package chap10Exception;

import java.util.Scanner;

// 1.화면에서 1~10사이의 숫자를 입력받아서 숫자만큼 * 출력하기
//	1~10 사이 숫자가 아닌경우 예외 강제 발생시키고, 다시 숫자를 입력받기

class numException extends RuntimeException { // Exception상속받아서 커스텀Exception만들기
	public numException(String msg) {
		super(msg);
	}
}

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~10 사이의 숫자를 입력해주세요");
		int num = sc.nextInt();

		while (true) {
			try {
				if (num < 1 || num > 10) {
					throw new numException("1~10 사이의 숫자를 입력해주세요");
				} else
					break;
			} catch (numException e) {
				System.out.println(e.getMessage());
				num = sc.nextInt();
			}

		}

		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}

	}

}
