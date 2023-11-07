package chap05array;

// 배열의 행의합, 열의 합을 구하기
public class Exam5$ {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 1, 2, 3, 4, 5 }, { 10, 20 }, { 100 } };

		// 열중에(2차원배열) 길이가 가장 긴 열의 개수를 구하기 (5)
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i].length) {
				max = arr[i].length;
			}
		}

		int[] cols = new int[max]; // []안에 열의 최대개수를 적어줘야해서 위에서 for문으로 열의 최대개수를 구함

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				cols[j] += arr[i][j]; // 2차원배열을 차례대로 cols배열에 더해줌
			}
			System.out.println(i + "행의 합은 : " + sum);
		}

		for (int i = 0; i < cols.length; i++) {
			System.out.println(i + "열의 합은: " + cols[i]);
		}

	}

}
