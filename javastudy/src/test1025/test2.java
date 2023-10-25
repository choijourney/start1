package test1025;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		/*
		 * 시스템과 가위(1), 바위(2), 보(3)를 하기 시스템은 1,2,3 중의 한개의 숫자를 저장하고, 한개의 숫자를 입력받아 가위바위보
		 * 게임하기
		 * 
		 * [결과] 가위(1), 바위(2), 보(3) 를 숫자로 입력하세요 1 사용자 승리!
		 * 
		 * 가위(1), 바위(2), 보(3) 를 숫자로 입력하세요 1 시스템 승리!
		 */

		int com = (int) (Math.random() * 3) + 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 를 숫자로 입력하세요.");
		int i = sc.nextInt();

		if (com > i) {
			System.out.println("사용자 승리!");
		} else if (com < i) {
			System.out.println("컴 승리!");
		} else {
			System.out.println("비김");
		}

	}

}
