package chap04IFLoopSwitch;

// 1~10 까지의 합을 출력하기

public class loopEx2 {

	public static void main(String[] args) {
		System.out.println("for문으로 1~10까지 합구하기");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		System.out.println("while문으로 구하기");
		sum = 0;
		int i = 1;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);

		System.out.println("do while 문으로 구하기");
		sum = 0;
		i = 1;
		do {
			sum += i;
			i++;
		} while (i < 11);
		System.out.println(sum);
	}

}
