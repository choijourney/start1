package chap4IFLoopSwitch;

import java.util.Scanner;

// 농장에 강아지와 병아리가 있다
// 강아지와 병아리의 전체 마리수와 다리수를 입력받으시오
// 강아지의 마리수와 병아리의 마리수를 출력하기
// [결과]
// 마리수 입력: 20
// 다리수 입력 : 60
// 강아지 : xx
// 병아리 : yy
public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("강아지,병아리 전체 마리수 입력");
		int total = sc.nextInt();
		System.out.println("강아지,병아리 전체 다리수 입력");
		int leg = sc.nextInt();
		boolean b = false;

		for (int i = 0; i <= total; i++) {
			for (int j = 0; j <= total; j++) {
				if (i + j == total && (4 * i + 2 * j) == leg) {
					System.out.println("강아지수 : " + i);
					System.out.println("병아리수 : " + j);
					b = true;
				}
			}
		}
		if (!b) { // b==false
			System.out.println("계산안됨");
		}

		// b= !b 대입을시켜줘야 b값이 반대로바뀐다.

	}

}
