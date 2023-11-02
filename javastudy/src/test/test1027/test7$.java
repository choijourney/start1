package test.test1027;

/*
Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
    java Test7 10
    int num = Integer.parseInt(args[0]);
  [결과]
  10의 약수 : 1,2,5,10,
*/
public class test7$ {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("commandLine에 숫자를 한개 입력해주세요.");
			return; // 메서드를 종료함
		}

		int num = Integer.parseInt(args[0]); // args배열의 문자열을 숫자변환 저장

		System.out.print(num + "의 약수 : ");
		for (int x = 1; x <= num; x++) {
			for (int y = 1; y <= num; y++) {
				if (x * y == num) {
					System.out.print(x + ",");
				}
			}
		}

	}

}
