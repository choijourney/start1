package test.test1025;

import java.util.Scanner;

/*
 * 시스템과 가위(1), 바위(2), 보(3)를 하기 시스템은 1,2,3 중의 한개의 숫자를 저장하고, 한개의 숫자를 입력받아 가위바위보
 * 게임하기
 * 
 * [결과] 가위(1), 바위(2), 보(3) 를 숫자로 입력하세요 1 사용자 승리!
 * 
 * 가위(1), 바위(2), 보(3) 를 숫자로 입력하세요 1 시스템 승리!
 */
public class test2$ {

	public static void main(String[] args) {
		int sys = (int) (Math.random() * 3) + 1;
		System.out.println("시스템은 : " + sys);

		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 를 숫자로 입력하세요");
		int human = sc.nextInt();

		boolean b = false;

		if (sys == human) {
			System.out.println("비김");
		} else {

			switch (sys) { // switch문 안에 if를 쓸땐 중괄호 생각하고쓰기
			case 1:
				if (human == 2) // 여기서 if문에 중괄호를 쓰면 게임이 오작동한다
					b = true; // 사용자가 이겼는데 시스템이 이겼다고..
				break; // 중괄호를쓰면 break 범위가 달라져서 인것같기도하고.

			case 2:
				if (human == 3)
					b = true;
				break;

			case 3:
				if (human == 1)
					b = true;
				break;

			}
			if (b == true) {
				System.out.println("사용자 승리");
			} else {
				System.out.println("시스템 승리");
			}
		}

	}

}
