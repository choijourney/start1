package test1030;

import java.util.Scanner;

/*
 * 2차원 배열을 이용하여 모래시계 출력하기
 * 
 * [결과]
 * 삼각형의 길이를 홀수로 입력하세요
 * 5
  *****
   ***
    *
   ***
  *****  
 */
public class test2$SandStar { // 인덱스에 추가하는거라 배열없이 만드는 일반별이랑 방법이 다르다
	// i값과 j값을 꼭 인덱스값으로 맞춰줘야한다
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("길이를 홀수로 입력하세요");
		int num = scan.nextInt();
		char[][] matrix = new char[num][num];
		// 위쪽 역삼각형부분의 * 채우기
		for (int i = 0; i <= matrix.length / 2; i++) {
			for (int j = i; j < matrix.length - i; j++) {
				matrix[i][j] = '*';
			}
		} // i는 1씩늘어나고 matrix.length-i 일땐 값이 1씩줄어드니까 i값이 바뀔때마다 값차이는 2씩난다 5였다가 3,1

		int half = num / 2;
		// 아래쪽 삼각형 두줄
		for (int i = half + 1; i < num; i++) { // 인덱스 3,4 를 i로 만듦
			for (int j = num - i - 1; j <= i; j++) { // 5-3-1=1 j는 인덱스 1부터 i값인 3까지 찍으니까 1,2,3을 *찍음
				matrix[i][j] = '*';
			}
		}

		for (char[] num2 : matrix) {
			for (char n : num2) {
				System.out.print(n);
			}
			System.out.println();
		}
	}

}
