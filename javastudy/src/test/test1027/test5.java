package test.test1027;

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
public class test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mount;

		while (true) {
			System.out.println("금액을 입력하세요");
			mount = sc.nextInt();
			if (mount <= 3330) {
				break;
			}
			System.out.println("동전이 부족합니다.");
		}

		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int[] coinCount = new int[6];
		int[] leftCount = new int[6];

		for (int i = 0; i < coin.length; i++) {
			int num = mount / coin[i]; // 동전개수
			if (num > 5) {
				num = 5;
			}
			System.out.println(coin[i] + "원 : " + num + "개");
			coinCount[i] = num;
			mount -= num * coin[i];
		}

		// 남은 동전

		for (int i = 0; i < coinCount.length; i++) {
			System.out.println("남은 동전 " + coin[i] + "원 : " + (5 - coinCount[i]) + "개");
		}

	}

}
