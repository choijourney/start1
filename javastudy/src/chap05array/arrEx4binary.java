package chap05array;

import java.util.Scanner;

public class arrEx4binary {

	public static void main(String[] args) {
		// 배열을 이용한 10진수를 2진수로 변환
		int binary[] = new int[32];
		System.out.println("2진수로 변환할 10진수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int divnum = num;
		int index = 0;
		while (divnum > 0) { // divnum이 0보다 큰동안
			binary[index++] = divnum % 2; // binary배열에 index값을 1씩증가시키면서 divnum%2 나머지값을 저장
			divnum /= 2; // divnum을 2로 나누고 다시 while문 첫줄로 가서 실행함 binary[0]= 1, binary[1]=0 ..
		}
		System.out.print(num + "의 2진수 : ");
		for (int i = index - 1; i >= 0; i--) { // 예를들어 index++는 1을 출력하고 눈에안보이게 2의값으로 존재하기때문에 index-1을 해줘야함. i--로 인덱스 1,0
												// 순으로 출력하게됨
			System.out.print(binary[i]); // 2진수는 10진수를 나누기 하고 나머지를 역순으로 읽으면 2진수기때문에 출력을 역순으로 함
		}
		System.out.println();

		// 클래스를 이용한 2진수 출력
		System.out.println(Integer.toBinaryString(num));

//		int ind = 0;
//		System.out.println(ind++);  //0 0을출력하고 1의값을 가지고있음

	}

}
