package chap03Operator;

import java.util.Scanner;

// 사과의 개수를 입력받아 필요한 바구니수 계산하기
// 바구니당 10개의 사과를 저장할 수 있다고 가정함
// [결과]
// 사과의 개수를 입력하세요
// 21
// 필요한 바구니 개수 : 3

public class Exam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사과 몇개?");
		int apple = sc.nextInt();
		System.out.println("필요한 바구니 개수: " + ((apple % 10 != 0) ? ((apple / 10) + 1) : apple / 10));

	}

}
