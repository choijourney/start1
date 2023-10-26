package test1025;

public class test6 {

	public static void main(String[] args) {
		/*
		 * 1부터 100까지의 숫자 중 2의 배수이거나, 3의 배수의 합을 구하기
		 */

		int sum3 = 0;
		for (int i = 2; i < 101; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				sum3 += i;
			}
		}
		System.out.println(sum3);

		sum3 = 0;
		int p = 0;

		// while 문
		while (p < 101) {
			p++;
			if (p % 2 == 0 || p % 3 == 0) {
				sum3 += p;
			}
		}
		System.out.println(sum3);

	}

}
