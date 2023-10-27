package chap5array;

import java.util.Arrays;

// 로또 번호 생성

public class arrEx3lotto {

	public static void main(String[] args) { // for문에 중괄호를 없애면 다음줄까지는 실행한다.
		int[] balls = new int[45];
		int[] lotto = new int[6];
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		} // 1~ 45 값 balls 배열에 차례대로 저장

		// balls 섞기
		for (int i = 0; i <= 1000; i++) {
			int f = (int) (Math.random() * balls.length); // 0~44까지 임의의 수 3이라고가정
			int t = (int) (Math.random() * balls.length); // 0~44까지 임의의 수 5라고 가정
			// swap 알고리즘
			int tmp = balls[f]; // tmp: 4 <= balls[3]
			balls[f] = balls[t]; // balls[3]:6 <=balls[5]:6
			balls[t] = tmp; // balls[5]:4 <=tmp:4
		}

		for (int b : balls)
			System.out.print(b + " ");

		// 선택된 데이터를 lotto 배열에 저장
		for (int i = 0; i < lotto.length; i++)
			lotto[i] = balls[i];

		System.out.println();
		for (int b : lotto)
			System.out.print(b + " ");
		System.out.println();
		// 로또번호 정렬
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - 1 - i; j++) { // -i 를 뺴는 이유는 마지막숫자는 검사할필요없어서 뺌
				if (lotto[j] > lotto[j + 1]) {
					int tmp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = tmp;
				}
			}
			System.out.print(i + ":");
			for (int a : lotto)
				System.out.print(a + " ");
			System.out.println();
		}

		// 유틸리티 Arrays 클래스를 이용한 정렬
		// Arrays : 배열객체의 다양한 기능 제공해주는 클래스
		System.out.println("Arrays로 정렬한 로또번호");
		for (int i = 0; i < lotto.length; i++)
			lotto[i] = balls[i];
		Arrays.sort(lotto); // lotto 배열을 정렬하기
		for (int a : lotto)
			System.out.print(a + " ");
		System.out.println();

	}

}
