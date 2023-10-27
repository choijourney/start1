package chap5array;

// String[] 배열과 String 은 사촌도 아니고 아예 다름 .!

public class arrEx7charAt {

	public static void main(String[] args) {
		String[] arr = { "123", "333", "234", "135" }; // 6+9+9+9
		// arr배열의 모든 숫자 자리수의 합을 출력하기

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				// arr[0].length() : String의 문자열의 길이
				// arr[0].charAt(j) : j번쨰 존재하는 char 문자 리턴
				sum += arr[i].charAt(j) - '0';
			}

		}
		System.out.println(sum); // 33
	}

}
