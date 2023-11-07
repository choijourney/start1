package chap05array;

// 11*11 크기의 사각형이 있다고 가정할때 .X로 X자 만들기
public class Exam8X {

	public static void main(String[] args) {
		char[][] matrix = new char[11][11];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j || i + j == 10) {
					matrix[i][j] = 'X';
				} else {
					matrix[i][j] = ' ';
				}
//				System.out.print(matrix[i][j]); 바로출력해도됨
			}
			System.out.println();
		}

		// 반복문을 이용해서 출력
		for (char[] x : matrix) {
			for (char c : x) {
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
