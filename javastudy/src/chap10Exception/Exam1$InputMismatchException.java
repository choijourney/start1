package chap10Exception;

import java.util.InputMismatchException;

// 1.화면에서 1~10사이의 숫자를 입력받아서 숫자만큼 * 출력하기
//	1~10 사이 숫자가 아닌경우 예외 강제 발생시키고, 다시 숫자를 입력받기

// 2. 입력값이 숫자가 아닌경우 InputMismatchException 예외가 발생함.
// 숫자만 가능합니다. 메세지 출력하고,다시 숫자 입력받기
// catch구문 : scan.next(); 를 써서 문자를 받았을때 버림.

import java.util.Scanner;

public class Exam1$InputMismatchException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while (true) {
			try {
				System.out.println("1~10사이의 숫자를 입력하세요");
				num = sc.nextInt(); // 정수아닌 값을 입력하면 InputMismatchException 예외 발생
				if (num < 1 || num > 10)
					throw new Exception("1~10사이의 숫자만 가능합니다");
				break; // 1~10숫자면 break
			} catch (InputMismatchException e) { // InputMismatchException import해야함
				System.out.println("정수만 가능합니다.");
				sc.next(); // 문자를 받아서 어디에도 저장하지않고 버림.
				continue;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				continue;
			}
		}
		System.out.println(num + ":");
		for (int i = 1; i <= num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
