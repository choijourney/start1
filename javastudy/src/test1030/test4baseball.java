package test1030;
/*
 * 숫자 맞추기 게임
 * 시스템이 4자리의 서로 다른 수를 저장한 후
 * 사용자가 저장된 수를 맞추는 게임
 *    자리수도 맞는 경우 : 스트라익
 *    자리수는 틀리지만 숫자가 존재하면 : 볼
 *  4스트라익이 되면 정답
 *  
 *  1. 시스템이 중복 되지 않도록 서로다른 4자리 수 저장(0 ~ 9)
 *  2. 화면으로 부터 4자리 정수를 입력
 *  3. 시스템의 수와 입력된 수를 비교하여
 *     스트라익, 볼을 결정, 화면 출력
 *  4. 4스트라익이 될때 까지 2,3 을 계속 실행  
 *  5. 정답인 된경우 몇번만에 정답을 맞췄는지 
 *     입력 갯수를 화면에 출력하기
 1차원 배열로 풀기 */

import java.util.Scanner;

public class test4baseball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("4자리 정수를 입력하세요");
		String numb = sc.next();
		char[] charNum = numb.toCharArray(); // String을 char배열에 저장

		int[] num = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] sys = new int[4]; // 시스템 배열에 랜덤숫자 4개 저장
		int r, t;
		for (int i = 0; i < 100; i++) {
			r = (int) (Math.random() * 10);
			t = (int) (Math.random() * 10);
			int tem = num[r];
			num[r] = num[t]; // swap
			num[t] = tem;
		}

		for (int i = 0; i < sys.length; i++) { // 랜덤숫자 4개 저장
			sys[i] = num[i];
		}

		// 값이 같은지 비교
		int strike = 0;
		int ball = 0;
		for (int i = 0; i < charNum.length; i++) {
			for (int j = 0; j < charNum.length; j++) {
				if (charNum[i] - '0' == sys[i]) {
					strike++;
					System.out.println(strike + "스트라이크");
				} else if (charNum[i] != sys[j]) {
				} else {
					ball++;
					System.out.println(ball + "볼");
				}
			}
		}

//		for (int a : sys) {
//			System.out.println(a);
//		}

	}

}
