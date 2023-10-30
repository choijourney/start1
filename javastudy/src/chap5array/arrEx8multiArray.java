package chap5array;

// 2차원 배열
// 2차원 배열은 1차원 배열의 참조변수의 배열임
// 자바에서는 다차원(2차원이상) 배열은 n-1 차원 배열의 참조변수의 배열임
// 	=> 다차원 배열은 배열의 배열로 표현됨
public class arrEx8multiArray {

	public static void main(String[] args) {
		// 배열의 선언과 생성
		int[][] arr = new int[3][2];
		// 초기화
		// int arr[0][0] : 요소값
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 50;
		arr[2][1] = 60;

		// 내용 출력하기
		// arr.length : 3 arr[i].length : 2
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + ",");
			}
			System.out.println();
		}

		// 1차원 배열 객체 변경하기
		System.out.println("1차원 배열 객체 변경하기");
		int[] arr1 = { 1, 2, 3, 4, 5 };
		arr[1] = arr1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + ",");
			}
			System.out.println();
		}

		arr1[3] = 5000; // arr1 값을 변경했더니 arr값도 변했다
		System.out.println("arr1[3]=5000 이후");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + ",");
			}
			System.out.println();
		}

		// 가변 배열 1차원배열에만 값을주고 2차원배열은 비워서 선언하는것
		int[][] a = new int[3][];

	}

}
