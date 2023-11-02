package test.test1027;

/*
 * 1부터 9까지의 숫자 중 중복되지 않는  숫자 3개를 선택하고, 정렬하여 출력하기.
 * 
 * 1. 1 ~ 9 저장한 배열 생성.
 * 2. 선택 숫자를 저장할 배열 선언. 3개 값
 * 3. 1 ~ 9 배열을 섞기.
 * 4. 섞인 배열에서 3개의 숫자를 선택된 배열에 저장
 * 5. 선택된 배열을 정렬하여 출력
 */
public class test6$ {

	public static void main(String[] args) {
		int[] arr = new int[9];
		int[] result = new int[3];
		for (int i = 0; i < 9; i++) { // 1~ 9숫자 배열에 저장
			arr[i] = i + 1;
		}

		// 배열안 숫자 섞기
		for (int i = 0; i < 10; i++) { // 10은 의미없는 숫자. 섞는횟수
			int index1 = (int) (Math.random() * 9); // 0~9 랜덤숫자
			int index2 = (int) (Math.random() * 9); // 0~9 랜덤숫자
			int tem = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = tem;

		}

		// 선택된 배열에 숫자3개저장
		for (int i = 0; i < 3; i++) {
			result[i] = arr[i];
		}

		// 정렬
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length - 1 - i; j++) {
				if (result[j] > result[j + 1]) {
					int tem = result[j];
					result[j] = result[j + 1];
					result[j + 1] = tem;
				}
			}
		}

		// 출력
		for (int resultArr : result) {
			System.out.println(resultArr);
		}

	}

}
