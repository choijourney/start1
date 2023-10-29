package chap4IFLoopSwitch;

import java.util.Scanner;

// 화면에 999 숫자가 입력 될 때 까지 숫자를 입력받아서, 입력받은 숫자의 합을 구하기

public class loopEx5 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("숫자를 여러개 입력하세요(종료:999)");
		Scanner sc = new Scanner(System.in);
		while (true) {
			int num = sc.nextInt(); // 1 2 3 999
			if (num == 999)
				break;
			sum += num;

		}
		System.out.println("입력받은 수의 합: " + sum); // 6
// Scanner의 nextInt는 반복문 안에 있으면 1 2 3 공백을 써서 숫자를 쓰면 따로 따로 num에 한번씩 넣어준다
// num = 1; num = 2; 이런식
	}

}
