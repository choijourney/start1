package chap03Operator;

// 단항 연산자 : 연산자의 피연산자가 한개인 수식

// 1. 증감연산자 : ++, --
// 		++ : 변수에 저장된 값을 1 증가
//		-- : 변수에 저장된 값을 1 감소

public class OpEx1 {

	public static void main(String[] args) {
		int x = 5, y = 5; // 변수를 한번에 여러개 선언가능
		x++;
		y--;
		System.out.printf("x=%d,y=%d\n", x, y); // x=6 , y= 4
		++x;
		--y;
		System.out.printf("x=%d,y=%d\n", x, y); // x=7, y=3

		// ++x , x++ 의 차이
		x = y = 5;
		y = ++x; // 1. x의 값 증가(6) , 2. x의 값을 y에 대입
		System.out.printf("x=%d,y=%d\n", x, y); // x=6, y=6
		y = x++; // 1. x의 값을 y에 대입, 2. x의 값을 증가
		System.out.printf("x=%d,y=%d\n", x, y); // x=7, y=6

		System.out.println("----");
		x = y = 5;
		System.out.println("x=" + x++); // 5 1. x의 값을 출력 2. x의 값이 증가
		System.out.println("x=" + ++x); // 7 1. x의 값을 증가 2. x의 값 출력
		System.out.println("y=" + y--); // 5
		System.out.println("y=" + --y); // 3

		x = y = 5;

		x = y++;
		System.out.println("x= " + x + " y= " + y); // x= 5 y=6
		x = ++y;
		System.out.println("x= " + x + " y= " + y); // x= 7 y=7

		int i = 1;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);

	}

}
