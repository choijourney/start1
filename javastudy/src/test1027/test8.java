package test1027;

/*
command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오
     java Test8 10 20

   [결과]
   10과 20 의 공약수 : 1,2,5,10,
 */
public class test8 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("command 라인에 숫자 2개를 입력해주세요");
			return;
		}

		int num = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]); // args값을 숫자로 바꿔저장

		int[] n = new int[num];
		int[] m = new int[num2]; // 공약수 수를 모르니 일단 num

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i * j == num) { // num의 공약수 저장
					n[i - 1] = i; // i는 index고 위에서 i가 1부터 시작하니까 1을빼준다
				}
			}
			for (int k = 1; k <= num2; k++) {

				if (k * i == num2) { // num2의 공약수 저장
					m[i - 1] = i;
				}
			}
		}

		System.out.print(num + "과 " + num2 + "의 공약수 : ");
		// 배열 초기값 0이 껴있어서 0이 아니고, 두배열 값이 같으면 출력하도록함
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < m.length; j++)
				if (n[i] != 0 && m[j] != 0 && n[i] == m[j]) { // 두배열의 길이가 다를수있으니 중첩 for
					System.out.print(n[i] + ",");
				}
		}

	}//

}
