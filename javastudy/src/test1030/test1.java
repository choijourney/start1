package test1030;

/*
 * int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		}; 
 * score 배열보다 가로 세로가 1씩 더큰 배열 result 배열 생성하기.
 * score 배열의 내용을 result에 저장하고,
 * 각 추가된 행과 열에는 각 행과 열의 합을 저장하고, result 배열의 내용 출력하기
  				
   
   
400 390 385 1175(전체합)  맨아래가로 줄  
맨오른쪽세로줄 - 240 255 225 230 225   */
public class test1 {

	public static void main(String[] args) {
		// 2차원배열 값이 다르면 예를들어 {1,2}, {123} 이런경우 가장 긴 배열의 값을 2차원배열 길이로 써줌
		int[][] score = { { 90, 80, 70 }, { 95, 85, 75 }, { 70, 80, 75 }, { 75, 70, 85 }, { 70, 75, 80 } };
		int[][] result = new int[score.length + 1][score[0].length + 1];
		// 가변배열로 배열을 만들면 for문에서 값을 대입할수없다

		int sum = 0;
		// score 배열 result 배열로 복사
		for (int i = 0; i < score.length; i++) {
			sum = 0;
			for (int j = 0; j < score[i].length; j++) {

				result[i][j] = score[i][j];
				sum += score[i][j];
				result[i][result[i].length - 1] = sum; // 열에 합계 추가 (맨오른쪽줄)

			}
		}

		// result배열에 합계추가
		for (int i = 0; i < score[i].length; i++) {
			sum = 0;
			for (int j = 0; j < score.length; j++) { // 0~3 반복
				sum += score[j][i];
				result[result.length - 1][i] = sum;

			}
		}

		// result 총합
		for (int i = 0; i < result.length; i++) {
			sum = 0;
			for (int j = 0; j < result[i].length; j++) {

				result[result.length - 1][result[i].length - 1] = sum;
				if (j == result[i].length - 1) {
					break;
				}
				sum += result[result.length - 1][j];
			}
		}

		for (int[] r : result) {
			for (int r2 : r) {
				System.out.print(r2 + "\t");
			}
			System.out.println();
		}
	}
}
