package test1030;

import java.util.Scanner;

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
public class test4$ {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr2 = new int[4];
		int r, t;
		for (int i = 0; i < 50; i++) { // 숫자섞기
			r = (int) (Math.random() * 10);
			t = (int) (Math.random() * 10);
			int tem = arr[r];
			arr[r] = arr[t];
			arr[t] = tem;
		}

		String st = "";
		for (int i = 0; i < arr2.length; i++) { // 4개랜덤숫자 문자열로 변환 (인덱스를 이용하기위해)
			arr2[i] = arr[i];
			st += arr2[i];
		}

		int cnt = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("4자리 정수를 입력해주세요.");
			String num = sc.next();
			int strike = 0;
			int ball = 0;
			cnt++;
			for (int i = 0; i < num.length(); i++) {
				for (int j = 0; j < st.length(); j++) {
					if (num.charAt(i) == st.charAt(j)) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
						break;
					}
				}

			}
			if (strike == 4) {
				System.out.println(cnt + "번만에 맞추셨습니다. 축하합니다.");
				break;
			} else {
				System.out.println(ball + "볼, " + strike + "스트라이크 입니다.");
			}
		}

	}

}
