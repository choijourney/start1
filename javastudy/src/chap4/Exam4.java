package chap4;

// 1~ 100까지 짝수의 합 구하기

public class Exam4 {

	public static void main(String[] args) {
		// for 문으로 구하기
		int sum = 0;
		for (int i = 0; i < 101; i += 2) {
			sum += i;
		}
		System.out.println(sum);

		// 다른 방식
		sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println(sum);

		// while문으로 구하기
		sum = 0;
		int i = 0;
		while (i < 101) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);
		// do while문으로 구하기
		sum = 0;
		i = 2;
		do {
			sum += i;
			i += 2;
		} while (i < 101);
		System.out.println(sum);
	}

}
