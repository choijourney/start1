package test1025;

public class test6 {

	public static void main(String[] args) {
		/*
		 * 1부터 100까지의 숫자 중 2의 배수이거나, 3의 배수의 합을 구하기
		 */

		// 2의 배수
		int sum = 0;
		for (int i = 2; i < 101; i += 2) {
			sum += i;
		}
		// 3의 배수
		int sum2 = 0;
		for (int i = 2; i < 101; i += 3) {
			sum2 += i;
		}
		// 6의 배수
		int sum3 = 0;
		for (int i = 6; i < 101; i += 6) {
			sum3 += i;
		}

		System.out.println(sum);
		System.out.println(sum2);

		System.out.println(sum + sum2);
		System.out.println(sum + sum2 - sum3);

	}

}
