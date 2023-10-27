package chap5array;

// 문자열 내에 각 소문자의 개수 출력하기
// cnt 배열의 요소가 1이상인 데이터만 출력하기
// cnt 배열의 값만큼 * 로 출력하기
public class Exam3toCharArray {

	public static void main(String[] args) {
		String str = "aaa  Ebbbbbcc";
		char[] c = str.toCharArray(); // String을 char타입 배열에 저장

		int[] cnt = new int[26]; // int배열을 만듦 초기값이 모두 0임

		for (int i = 0; i < c.length; i++) { // c의 길이만큼 반복함
			if (c[i] >= 'a' && c[i] <= 'z') { // c가 소문자면
				cnt[c[i] - 'a']++; // cnt[c-'a'값이 인덱스] ++; 예를들어 c에 'a'가 있으면 'a'-'a' = 0
									// cnt[0]++; cnt[1]++; cnt[2]++; ... cnt[25]++;
									// int cnt배열의 [0] 인덱스에 숫자가 추가됨 1.
			}
		}

		for (int i = 0; i < cnt.length; i++) { // cnt 길이만큼 반복함 0~ 25까지.
			if (cnt[i] > 0) { // int배열 cnt값이 0보다 크면
				System.out.print((char) (i + 'a') + ":" + cnt[i] + "개 => "); // a: cnt 개 b: cnt개 .. 'a'에+i로 1씩증가돼서 b c 로
																				// 바뀜
			}
			for (int j = 0; j < cnt[i]; j++) { // j는 cnt값만큼 반복 예를들어 0~4
				System.out.print("*");
			}
			System.out.print(" ");
		}

	}

}
