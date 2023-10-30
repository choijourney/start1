package chap5array;

// 2차원 배열의 생성과 초기화
public class arrEx9 {

	public static void main(String[] args) {
		int[][] arr = { { 10, 20 }, { 30, 40 }, { 50, 60 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + "\t");
			}
			System.out.println();
		}

		// 각 행의 합계 출력
		int[] cols = new int[arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			int sum = 0; // sum=0 위치가 여기있어야 0행의 합, 1행의합,2행의합 을 알수있음
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				cols[j] += arr[i][j];
			}

			System.out.println(i + "행의 합: " + sum);
		}
		// 열의 합계 출력
		for (int i = 0; i < cols.length; i++) {
			System.out.println(i + "열의 합: " + cols[i]);
		}
	}

}
