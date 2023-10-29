package test1027;

/*
1부터 100까지 임의의 수 10개를  배열에 저장하고, 정렬하여 출력하기
  1. 배열 선언, 생성.
  2. 임의의 수를 10개 배열에 저장
  3. 정렬
  4. 출력
*/
public class test4NorepeatRandom {

	public static void main(String[] args) {
		int[] num = new int[10];
		int tem;

		// 중복되지않는 랜덤숫자 배열에 저장

		for (int i = 0; i < num.length; i++) { // num[i]에 값 10개를 저장할동안 반복
			num[i] = (int) (Math.random() * 100) + 1; // 랜덤숫자를 배열에 저장
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) { // num[i]와 num[j] 값이 같으면 i--
					i--;
				}
			}
		}

		// 배열 정렬
		for (int i = 0; i < num.length; i++) { // 중첩문으로 비교해야 순서가 정렬됨
			for (int j = 0; j < num.length - 1 - i; j++) { // 예를들어 length가 3으로가정하고 -1이니까2. j는 0~ 1까지 반복
															// 마지막숫자는 비교안해도 되는 큰숫자니까 -i
				if (num[j] > num[j + 1]) { // 여기서 j+1을 해서 인덱스 0>1 / 1>2 비교. 할거니까 위에서 -1을 뺸거임
					tem = num[j];
					num[j] = num[j + 1];
					num[j + 1] = tem;

				}

			}
			System.out.print(i + ": ");
			for (int result : num) {
				System.out.print(result + " ");

			}
			System.out.println();
		}

		// 배열 정렬
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
//		Arrays.sort(num);
//		for (int nums : num) {
//			System.out.println(nums);
//		}

	}
}
