package test.test1027;

import java.util.Scanner;

public class test5Coingpt {

	public static void main(String[] args) {
		// 각 동전의 갯수
		int[] coinCounts = { 5, 5, 5, 5, 5, 5 }; // 500원, 100원, 50원, 10원, 5원, 1원

		Scanner scanner = new Scanner(System.in);
		System.out.print("교환할 금액을 입력하세요: ");
		int amount = scanner.nextInt();

		if (amount < 1) {
			System.out.println("금액은 1 이상이어야 합니다.");
			return;
		}

		int[] coins = { 500, 100, 50, 10, 5, 1 };
		int[] change = new int[6]; // 동전 갯수를 저장할 배열

		for (int i = 0; i < coins.length; i++) {
			int coin = coins[i];
			int count = amount / coin;
			if (count > coinCounts[i]) {
				count = coinCounts[i];
			}
			change[i] = count;
			amount -= count * coin;
			coinCounts[i] -= count;
		}

		if (amount == 0) {
			System.out.println("동전 교환 결과:");
			for (int i = 0; i < coins.length; i++) {
				System.out.println(coins[i] + "원 짜리 동전: " + change[i] + "개");
			}
		} else {
			System.out.println("동전 교환 불가능: 동전이 부족합니다.");
		}

	}

}
