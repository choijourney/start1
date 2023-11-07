package chap05array;

//String배열을 int배열로 ( for문과 Integer.parseInt()이용)
// charAt() : 인수에 인덱스를 쓰면 해당 문자를 출력함 

public class arrEx7$ {

	public static void main(String[] args) {
		String[] arr = { "123", "333", "234", "135" }; // 6+9+9+9
		// arr배열의 모든 숫자 자리수의 합을 출력하기
		char[] ch = new char[3];
		String convert;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			convert = arr[i];
			ch = convert.toCharArray(); // char배열로 변환
			for (int j = 0; j < ch.length; j++) {
				sum += ch[j] - '0'; // 아스키코드값으로 출력되니까 '0'을 빼면 33출력
			}
		}
		System.out.println(sum);

		// 다른 방법. charAt을 이용

		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				sum += arr[i].charAt(j) - '0';
			}
		}
		System.out.println(sum);

		// 123+333+234+135
		int nums;
		String stNums;
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			stNums = arr[i];
			nums = Integer.parseInt(stNums);
			sum += nums;
		}
		System.out.println(sum); // 825

		// String 배열을 int 배열로 변환
		int[] intArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}

		for (int intAr : intArr) { // 변환한 int배열 출력
			System.out.println(intAr);
		}
	}

}
