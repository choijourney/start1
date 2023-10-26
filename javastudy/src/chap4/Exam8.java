package chap4;

// 가로 구구단 출력하기 
// 2*2=4	3*2=6
// 2*3=6	3*3=9

public class Exam8 {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.print(i + "단\t");
		}
		System.out.println();
		int i, j;
		for (j = 2; j <= 9; j++) {
			for (i = 2; i <= 9; i++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}

	}

}
