package test1027;

/*
Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
    java Test7 10
    int num = Integer.parseInt(args[0]);
  [결과]
  10의 약수 : 1,2,5,10,
*/
public class test7 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("command라인에 숫자를 입력해주세요");
			return;
		}

		int num = Integer.parseInt(args[0]);

		int x, y;
		for (x = 1; x < args.length; x++) {
			for (y = 1; y < args.length; y++) {
				if (x * y == 10) {
					System.out.println("숫자의 약수 : " + x + "," + y);
				}

			}
		}

	}
}
