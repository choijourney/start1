package test1024;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		/*
		 * 화면에서 금액입력받아서 500,100,50,10,1원 동전으로 바꾸기. 필요한 동전의 갯수 출력하기. 전체동전은 최소 갯수로 바꾼다.
		 * [결과] 금액을 입력하세요 5641 500원 : 11개 100원 : 1개 50원 : 0개 10원 : 4개 1원 : 1개
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = sc.nextInt();

		int oBack = money / 500;
		int back = (money - (500 * oBack)) / 100;
		int oShip = (money - (500 * oBack) - (100 * back)) / 50;
		int ship = (money - (500 * oBack) - (100 * back) - (50 * oShip)) / 10;
		int il = (money - (500 * oBack) - (100 * back) - (50 * oShip) - (10 * ship)) / 1;
		System.out.println("500원 : " + oBack + "개  100원 : " + back + "개  50원 : " + oShip + "개 10원 : " + ship + "개 1원 : "
				+ il + "개");

	}

}
