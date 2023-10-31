package chap6class;

// 재귀함수 : Recursive Call => 함수내에서 내가 나를 다시 호출하는 함수 : 자주쓰진않지만 꼭 필요할때가있음
public class FactorialEx1 {

	public static void main(String[] args) {
		System.out.println("4!=" + factorial(4)); // factorial 4 = > 1*2*3*4 = 24

	}

	private static int factorial(int i) {
		return (i == 1) ? 1 : (i * factorial(i - 1)); // i가 1이 아니면 i* (4-1) (4-2) .. i 에 3,2,1 을 곱함
	}

}
