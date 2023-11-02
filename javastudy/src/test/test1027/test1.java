package test.test1027;

import java.util.Scanner;

/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */
public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // char 로 바꿔볼까
		System.out.println("숫자를 입력해주세요");
		String num = sc.next(); // char 배열에 넣기위해 String으로 값을 받음
//		int num = sc.nextInt(); 		// int변수에는 .length를 쓸수없고 index가없어서 1 2 3 따로 출력할수없고 1234묶어서출력된다
		char[] nums = num.toCharArray(); // String을 "123"이 아닌 '1' '2' '3' 따로 쓸수있게 char 배열에 저장.
		char[] copy = new char[nums.length]; // 복사해서 거꾸로 뒤집을 배열이 필요
		int index = 0;

		// copy배열에 숫자를 거꾸로 대입함
		for (int i = nums.length - 1; i >= 0; i--) { // length니까 index랑 맞추려면 -1 / 4 3 2 1 0
			copy[index++] = nums[i]; // copy [index 0 ~ 4] 까지 저장하고 index는 ++ 돼서 5로 바뀜
		}

		System.out.println();
		// 대칭수인지 확인
		int count = 0; // 같은수를 비교할때마다 카운트를 셈. 예를들어 배열길이가 5다. 두배열의 수가 같은수이면 카운트를 1씩 증가시켰는데
						// 카운트가 5가 돼면 모든 수가 같은것이니 대칭수.

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]); // 12321 : 대칭수 입니다 를 완성하기위한 숫자

			if (nums[i] == copy[i]) {
				count++; // nums와 copy를 비교할때마다 count는 1씩증가
			}
		}
		if (count == nums.length) { // count가 nums.length와 같으면
			System.out.print(" : 대칭수 입니다.");
		} else {
			System.out.println(": 대칭수가 아닙니다.");
		}

//		@ int로 받은 sc.nextInt 값을 int배열에 넣으면 1 2 3 을 따로보지않고 123 묶어서 본다
//		1 2 3 따로 보게하려면 char를 '1' '2' 이용해야할까?  Yes
//		int n[] = new int[nums.length()]; 	
//		int[] copy = new int[nums.length()]; 이렇게하면안됨

	}

}
