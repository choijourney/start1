package chap5array;

// command line에서 숫자를 입력받아 숫자의 자리수 합을 출력하기
// java Exam4 1234

// 1+2+3+4=10

public class Exam4TernaryOperator {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("command 라인에 숫자를 입력하세요");
			return;
		}
		int sum = 0;
		char[] nums = args[0].toCharArray();
		for (int i = 0; i < nums.length; i++) {
			// '0':48
			// '1':49
			sum += nums[i] - '0'; // 순수 숫자값 합계
			System.out.print(nums[i] + (i == nums.length - 1 ? "=" : "+"));
		}
		System.out.println(sum);
	}
}