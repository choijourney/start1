package chap5array;

// command line에서 숫자를 입력받아 숫자의 자리수 합을 출력하기
// java Exam4 1234

// 1+2+3+4=10

public class Exam4 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("command 라인에 숫자를 입력하세요");
		}

		int sum = 0;
		char[] ch = args[0].toCharArray();
		for (int j = 0; j < args.length; j++) {
			sum += ch[j] - '0'; // '0' : 48
			System.out.println(ch[j] + (j == ch.length - 1 ? "=" : "+"));
		}
		System.out.println(sum);

//		String[]s = {"1","2"};
//		int[] n= Integer.parseInt(s);

	}

}
