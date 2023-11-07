package chap08interface;

// 추상메서드에 매개변수가 존재. 리턴타입이 없는 경우
// (메개변수)->{구현}
// 매개변수가 한개인경우 () 생략가능
// 실행문장이 한개인 경우 {} 생략가능
interface LamdaInterface2 { // 람다식에서 사용하기 위해서는 FunctionalInterface 여야함.
	void method(int a);
}

public class LamdaEx2privateCalc {

	public static void main(String[] args) {
		// 매개변수 *5 출력하는 람다식 구현하기
		LamdaInterface2 fi = (a) -> {
			System.out.println(a * 5);
		};
		fi.method(10); // 50

		fi = a -> System.out.println(a * 5);
		fi.method(10); // 50
		// 제곱을 출력하는 람다식 구현하기
		fi = a -> System.out.println(a * a);
		fi.method(10);
		// 매개변수까지의 합 출력하는 람다식 구현하기
		fi = a -> {
			int sum = 0;
			for (int i = 1; i <= a; i++) {
				sum += i;
			}
			System.out.println("1~" + a + "까지의 합:" + sum);
		};
		fi.method(100);
		calc(fi, 10); // 1~10까지의 합을 출력

		calc(a -> {
			int sum = 0;
			for (int i = 0; i <= a; i += 2) {
				sum += i;
			}
			System.out.println("1~" + a + "까지 짝수의 합:" + sum);

		}, 10); // 1~10까지의 짝수합을 출력
	}

	private static void calc(LamdaInterface2 fi, int a) {
		fi.method(a);
	}

}
