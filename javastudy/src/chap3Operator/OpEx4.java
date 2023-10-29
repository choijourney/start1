package chap3Operator;

// 이항연산자 : 비교(관계) 연산자 => 결과는 boolean 

// 이항연산자 : 논리 연산자 => &&(AND) , ||(OR)
// T && T => T
// T && F => F
// T || T => T
// T || F => T
// F || F => F
// => && 조건의 앞쪽의 결과가 false인경우 뒤부분의 연산을 수행하지 않는다
// || 조건의 앞쪽의 결과가 true인 경우 뒤부분의 연산을 수행하지않는다 

public class OpEx4 {

	public static void main(String[] args) {
		int x = 1, y = 1;
		// %b : boolean 값 출력
		System.out.printf("%d == %d : %b\n", x, y, (x == y)); // true
		System.out.printf("%d == %d : %b\n", x, y, (x != y)); // false
		System.out.printf("%d == %d : %b\n", x, y, (x > y)); // false
		System.out.printf("%d == %d : %b\n", x, y, (x >= y)); // true

		// 논리 연산자
		System.out.println("x==1 && y==2 : " + (x == 1 && y == 2)); // false
		System.out.println("x==1 || y==2 : " + (x == 1 || y == 2)); // true

		String str = null;
		if (str == null || str.equals(""))
			System.out.println("str 변수에 값이 없음");
		str = "";

		if (str == null | str.equals(""))
			System.out.println("str 변수에 값이 없음");

	}

}
