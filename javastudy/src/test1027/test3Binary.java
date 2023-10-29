package test1027;

import java.util.Scanner;

/*
 * 10진수를 2,8,10,16 진수로 변경하기
 * [결과]
10진수 값을 입력하세요
16

16의 2진수 :10000
16의 8진수 :20
16의 10진수 :16
16의 16진수 :10

*/
public class test3Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10진수 값을 입력하세요");
		int num = sc.nextInt();
		int copynum = num;
		int index = 0;

		int[] binary1 = new int[10]; // 6 숫자는 큰 의미가 없다

		// 2진수 값 구하기
		while (copynum > 0) { // copynum >= 0 으로 하면 0을 무한으로 나누니까 예외가뜸 > 0보다 클때까지 나누게 해야함.
			binary1[index++] = copynum % 2; // index 0부터 index 4까지 저장하고 마지막에 5로 바뀐다음
			copynum /= 2;

		}
		System.out.print(num + "의 2진수 :");
		for (int i = index - 1; i >= 0; i--) { // 여기서 5가 출력. 그래서 1을 빼야함 ++ 특성때문임.
			System.out.print(binary1[i]); // 16의 2진수: 10000 으로 출력되는데 초기화를 6으로 했는데 0이 하나 출력이 안되는이유?
		} // binary.length-1 로 계산하면 binary[i] 의 i가 9,8,7.. 이렇게 출력해서 0000010000 이렇게 출력될거임
			// 하지만 따로 변수로 index를 만들고 index에만 저장하고 index를 출력했으니 0이 안나옴

		System.out.println();

		// 8진수 값 구하기

		int[] octal1 = new int[5]; // 5는 의미없는 숫자

		copynum = num;
		index = 0;

		while (copynum > 0) { // 8진수를 8진수 배열에 넣는과정
			octal1[index++] = copynum % 8;
			copynum /= 8;
		}

		// 8진수 배열 출력 octal1[index]에 저장했으니 ocral1[index]만 출력하면 초기값 0은 안나옴
		System.out.print(num + "의 8진수 :");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(octal1[i]);
		}

		System.out.println();

		// 10진수 값

		System.out.print(num + "의 10진수 :" + num);
		System.out.println();

		// 16진수 값 구하기

		copynum = num;
		index = 0;

		int[] hex1 = new int[5]; // 5는 의미없는 숫자

		while (copynum > 0) { // copynum이 0보다 클동안 16으로 나누기하고 나머지를 16진수 배열에 추가
			hex1[index++] = copynum % 16;
			copynum /= 16;
		}

		// 16진수 배열 출력
		System.out.print(num + "의 16진수 :");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(hex1[i]);
		}
		sc.close();

	}

}
