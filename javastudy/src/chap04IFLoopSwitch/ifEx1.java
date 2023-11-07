package chap04IFLoopSwitch;

import java.util.Scanner;

// if 문

public class ifEx1 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if (score >= 60) {
			System.out.println("합격입니다.");

		}
		if (score >= 60) {
			System.out.println("축하합니다.");
		} else {
			System.out.println("다음 기회에.");
		}

		// 점수별로 학점 출력하기
		if (score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}

	}

}
