package test1027;

/*
command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오
     java Test8 10 20

   [결과]
   10과 20 의 공약수 : 1,2,5,10,
 */
public class test8$ {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("commandLine에 숫자를 두개 입력해주세요");
			return; // 메서드를 종료함
		}

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int[] num1Arr = new int[8]; // 8 은 의미없는숫자
		int[] num2Arr = new int[8]; // 8 은 의미없는숫자
		int index = 0;

		// num1 공약수
		for (int x = 1; x <= num1; x++) {
			for (int y = 1; y <= num1; y++) {
				if (x * y == num1) {
					num1Arr[index++] = x; // num1Arr 배열에 num1의 공약수 저장
				}
			}
		}

		// num2 공약수
		int index2 = 0;
		for (int x = 1; x <= num2; x++) {
			for (int y = 1; y <= num2; y++) {
				if (x * y == num2) {
					num2Arr[index2++] = x;
				}
			}
		}
		System.out.print(num1 + "과 " + num2 + "의 공약수 : ");
		// 두 배열중 겹치는 수가 두수의 공약수
		for (int i = 0; i < index; i++) {
			for (int j = 0; j < index2; j++) { // j<index 주의. -1을하면 인덱스가안맞아서 오류
				if (num1Arr[i] == num2Arr[j]) {
					System.out.print(num1Arr[i] + " ");
				}
			}
		}

	}

}
