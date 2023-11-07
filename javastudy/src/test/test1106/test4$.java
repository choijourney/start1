package test.test1106;

/*
 * LambdaInterface3 인터페이스를 이용하여 결과가 나오도록
 * LambdaInterface3 인터페이스를 람다식을 이용하여 함수 객체를 구현하고,
 * calc 함수를 구현하기.
 */
interface LambdaInterface3 {
	int method(int x, int y);
}

public class test4$ {
	public static void main(String[] args) {
		LambdaInterface3 f;
		System.out.println("두수 (5,2)의 합:" + calc(5, 2, f));// 7
		System.out.println("두수 (5,2)의 곱:" + calc(5, 2, f));// 10
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("arr 배열의 최대값:" + calc(arr, f));// 10
		System.out.println("arr 배열의 최소값:" + calc(arr, f));// 1
	}

	private static int calc(int[] arr, LambdaInterface3 f) { // main이 static이니까 calc도 static으로 만들기
		int r = arr[0];
		for (int a : arr) {
			r = f.method(r, a);
		}
		return r;
	}

}
