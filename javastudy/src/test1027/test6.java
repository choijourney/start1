package test1027;

/*
 * 1부터 9까지의 숫자 중 중복되지 않는  숫자 3개를 선택하고, 정렬하여 출력하기.
 * 
 * 1. 1 ~ 9 저장한 배열 생성.
 * 2. 선택 숫자를 저장할 배열 선언. 3개 값
 * 3. 1 ~ 9 배열을 섞기.
 * 4. 섞인 배열에서 3개의 숫자를 선택된 배열에 저장
 * 5. 선택된 배열을 정렬하여 출력
 */
public class test6 {

	public static void main(String[] args) {
		// 1~9 까지 숫자 배열에 저장
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] p = new int[3]; // 나중에 p배열에 num중 3개숫자를 옮길거임

		// num배열 숫자 섞기. 인덱스를 이용해 값을 서로 스왑
		for (int i = 0; i < 30; i++) {
			int r = (int) (Math.random() * 9);
			int t = (int) (Math.random() * 9);
			int temp = num[r];
			num[r] = num[t];
			num[t] = temp;
		}

		// p에 num저장
		for (int i = 0; i < p.length; i++) {
			p[i] = num[i];
		}

		// p 정렬
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3 - 1 - i; j++) { // index때문에 1을빼고 마지막숫자는 비요안할거라 i를 뻄
				if (p[j] > p[j + 1]) {
					int tmp = p[j];

					p[j] = p[j + 1];
					p[j + 1] = tmp;
				}
			}
		}

		// 정렬된 p 출력
		for (int k : p) {
			System.out.println(k);
		}

	}

}
