package test.test1030;

/*
 * int[][] score = {	요소가 맨오른쪽에 저장될지, 맨아래에 저장될지가 중요
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
		int[][] score = { { 90, 80, 70 }, { 95, 85, 75 }, { 70, 80, 75 }, { 75, 70, 85 }, { 70, 75, 80 } };
		int[][] result = new int[score.length + 1][score[0].length + 1];
		// score 값과 합계를 result 배열에 저장
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j]; // score 값을 result 배열에 저장
				// 마지막 열에 행의 합을 저장
				result[i][score[i].length] += score[i][j]; // 인덱스 [i]는 0,1,2,3,4로 바뀌고 score[i].length는 3이니까 [i][3] 에
															// score[i][j]가 들어감
				// 마지막 행에 열의 합을 저장
				result[score.length][j] += score[i][j]; // 인덱스가 score.length면 [5][j] j값은 0,1,2로 바뀌니까 [5][0]에
														// score[0][0]이 들어가고, [5][1]에 score[0][1] 이들어감
				// 전체합 result 배열의 마지막 셀에 저장
				result[score.length][score[i].length] += score[i][j];
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%5d", result[i][j]);
			}
			System.out.println();
		}
		System.out.println("개선 for 구문으로 출력");
		for (int[] arr : result) { // 인덱스 사용.
			for (int a : arr) {
				System.out.printf("%5d", a);
			}
			System.out.println();
		}
	}
}
