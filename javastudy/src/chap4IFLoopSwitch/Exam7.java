package chap4IFLoopSwitch;

// 1에서 100까지 중 2의 배수도 아니고, 3의 배수도 아닌 수의 합을 구하기

public class Exam7 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);

		// 티쳐방식
		sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}

		}
		System.out.println(sum);

	}

}
