package test.test1026;
/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			
	8	7	6		
5	4	3	2	1	
 
맨위 9의 숫자를 구하는 공식은 맨아래줄 5+3+1 =9 */

import java.util.Scanner;

public class test4$NumStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이는 :");
		int height = sc.nextInt();
		int bottom = height * 2 - 1;
		int two = bottom / 2;
		int sum = 0;

		// 삼각형 맨위 꼭지점 처음숫자 구하기
		for (int i = 1; i <= bottom; i += 2) {
			sum += i; // 이렇게해도되고 height*height 제곱수를 써도됨
		}

		// 삼각형 만들기
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < bottom; j++) {
				if (j >= two - i && j <= two + i) {
					System.out.print(sum-- + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

}
