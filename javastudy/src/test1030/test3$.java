package test1030;

import java.util.Scanner;

/*
배열의 크기를 홀수로 입력하세요
5
17	16	15	14	13	
 	12	11	10	 	
 	 	9	 	 	
 	8	7	6	 	
5	4	3	2	1	
 */
public class test3$ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("길이를 홀수로 입력하세요");
		int num = scan.nextInt();

		int[][] arr = new int[num][num];

		int sum = 0; // 처음숫자구하기
		for (int i = 0; i < num; i++) {
			sum += i;
		}
		int data = sum + 2;

		// 모래시계만들기
		for (int i = 0; i < num; i++) {
//			for(int j=; )
		}
	}

}
