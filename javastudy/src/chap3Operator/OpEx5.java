package chap3Operator;

// 이항연산자 : 비트 연산자 &(AND) , |(OR) , ~(Not) , ^(XOR)

public class OpEx5 {

	public static void main(String[] args) {
		System.out.println(6 & 3); // 2
		// 6 : 00000110
		// 3 : 00000011
		// ---------------
		// & 00000010 : 2 비트를 비교해서 둘다 1이면 1 둘중 하나라도 0이면 0

		System.out.println(6 | 3); // 7
		// 6 : 00000110
		// 3 : 00000011
		// ---------------
		// | : 00000111 : 7

		System.out.println(6 ^ 3); // 5
		// 배타적 or 비트가 서로 다르면 1.
		// 6 : 00000110
		// 3 : 00000011
		// ^ : 00000101 : 5

		System.out.println(~10); // -11
		// ~ 값을 반대로 바꿈 ! 과 같은역할
		// 10 : 00001010
		// ---------------
		// ~ : 11110101

		// 자바에선 음수를 2의 보수로 표현함.
		// 2의 보수 : 1의 보수 + 1
		// 왼쪽 비트 한개가 부호비트 : 0(양수), 1(음수)
		// 1110101 : ? 수의 2의 보수
		// ? : 1110101의 2의 보수. 원래수
		// 1110101 : 1의 보수 => 0001010
		// 2의 보수 => 0001010 + 1 => 0001011 = > 10진수로 11

	}

}