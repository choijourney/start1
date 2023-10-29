package test1025;

/*
 * 1부터 100까지의 숫자 중 2의 배수이거나, 3의 배수의 합을 구하기
 */
public class test6$ {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				sum += i;

			}
		}
		System.out.println(sum);

		// while문

		int index = 0;
		sum = 0;
		while (index < 101) {
			index++;
			if (index % 2 == 0 || index % 3 == 0) {
				sum += index;
			}
		}
		System.out.println(sum);

	}
}
