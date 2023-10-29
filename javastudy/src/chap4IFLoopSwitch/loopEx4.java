package chap4IFLoopSwitch;

// break : switch,반복문 에서 구문을 벗어남
// continue : 반복문의 처음으로 이동

public class loopEx4 {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.println("\n" + i + "단");
			for (int j = 2; j <= 9; j++) {
//				if(j==5) break;   각 단의 *4 까지만 출력 
				if (j == 5)
					continue; // 이 시점에서 바로 반복문의 처음으로 이동.

				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

	}

}
