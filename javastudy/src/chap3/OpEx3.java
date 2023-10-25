package chap3;

// 이항연산자 : 산술연산자 
// + 
// - 
// *
// /
// %

public class OpEx3 {

	public static void main(String[] args) {
		int x = 10, y = 8;
		System.out.printf("%d+%d=%d\n", x, y, (x + y)); // 10+8=18
		System.out.printf("%d-%d=%d\n", x, y, (x - y));
		System.out.printf("%d*%d=%d\n", x, y, (x * y));
		System.out.printf("%d/%d=%d\n", x, y, (x / y));
		System.out.printf("%d %% %d=%d\n", x, y, (x % y)); // %를 쓸땐 %% 두번씀

		System.out.println(3 / 2); // 1 int = int/int

		// 부호가 다른 경우의 나누기
		System.out.println(10 / 8); // 1
		System.out.println(-10 / 8); // -1
		System.out.println(10 / -8); // -1
		System.out.println(-10 / -8);// 1
		// 부호가 다른 경우의 나머지
		System.out.println(10 % 8); // 2
		System.out.println(-10 % 8);// -2
		System.out.println(10 % -8); // 2
		System.out.println(-10 % -8); // -2
		// 나머지의 결과값은 나누어지는수의 부호를 따라간다
	}

}
