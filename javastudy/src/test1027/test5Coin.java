package test1027;

import java.util.Scanner;

/*
동전의 종류와 동전의 갯수 지정하여, 지정된 갯수만큼만 동전 변경하기
500,100,50,10,5,1원짜리 동전이 각각 5개씩 있다고 가정할때,
입력된 금액을 동전으로 바꿔주고, 남은 동전을 출력하기

[결과] 
금액을 입력하세요
36000
동전이 부족합니다.

[결과] 
금액을 입력하세요
3010
500원:5
100원:5
50원:0
10원:1
5원:0
1원:0
남은 동전 500원:0개
남은 동전 100원:0개
남은 동전 50원:5개
남은 동전 10원:4개
남은 동전 5원:5개
남은 동전 1원:5개
*/
public class test5Coin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int money;
		while (true) {
			System.out.println("금액을 입력하세요");
			money = sc.nextInt();
			if (money <= 3330) {
				break;
			}
			System.out.println("동전이 부족합니다.");
		}

		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int[] coinCount = new int[6]; // 동전 개수 카운트
		int[] leftCoin = new int[6]; // 남은동전수
		int count;

		for (int i = 0; i < coin.length; i++) {
			count = money / coin[i]; // 동전개수 = 돈 나누기 동전
			if (count >= 5) { // 동전개수가 5보다크면
				count = 5; // 동전개수는 5
			}
			coinCount[i] = count; // 동전개수 배열에 동전개수추가
			money -= count * coin[i]; // 돈= 돈- 동전개수*500 3000-5*500 = 500
			leftCoin[i] = 5 - count;
		}

		for (int i = 0; i < coinCount.length; i++) {
			System.out.println(coin[i] + "원 :" + coinCount[i] + "개");
		}
		for (int i = 0; i < leftCoin.length; i++) {
			System.out.println("남은 동전 " + coin[i] + "원 :" + leftCoin[i] + "개");
		}

	}//

}
