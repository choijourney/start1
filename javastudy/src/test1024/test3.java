package test1024;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		/*
		 * 화면에서 점수를 입력받아서 90점 이상이면 A학점,80점 이상이면 B학점 70점 이상이면 C학점,60점 이상이면 D학점 60 점 미만이면
		 * F학점을 출력하기
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		int score = sc.nextInt();

		System.out.println((score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F");

	}
}
