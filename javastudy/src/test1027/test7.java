package test1027;

/*
Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
    java Test7 10
    int num = Integer.parseInt(args[0]);
  [결과]
  10의 약수 : 1,2,5,10,
*/
public class test7 {

	public static void main(String[] args) { // 배열을 이용한 방법
		if (args.length == 0) {
			System.out.println("command라인에 숫자를 입력해주세요");
			return;
		}

		int num = Integer.parseInt(args[0]);
		int numArr[] = new int[num];
		int numArr1[] = new int[num]; // num의 약수의 개수를 넣고싶은데 불가능하니까 일단 num

		int x, y;
		for (x = 1; x <= num; x++) { // 10의 약수면 1~10까지 반복해야함
			for (y = 1; y <= num; y++) {
				if (x * y == 10) {
					numArr[x - 1] = x;
				}

			}
		}

		// numArr 출력. 초기화값 0이 껴있어서 0이 아닌경우 출력하도록 함.
		System.out.print("10의 약수는 : ");
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] != 0) {
				System.out.print(+numArr[i] + ",");
			}
		}

	}
}
