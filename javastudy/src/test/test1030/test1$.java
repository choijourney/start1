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
public class test1$ {

	public static void main(String[] args) {
		int[][] score = { { 90, 80, 70 }, { 95, 85, 75 }, { 70, 80, 75 }, { 75, 70, 85 }, { 70, 75, 80 } };

		int[][] result = new int[score.length + 1][score[0].length + 1];

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];

				result[score.length][j] += score[i][j];
				result[i][score[i].length] += score[i][j];
				result[score.length][score[i].length] += score[i][j];
			}
		}

		for (int[] re : result) {
			for (int r : re) {
				System.out.print(r + "\t");
			}
			System.out.println();
		}
	}

}
