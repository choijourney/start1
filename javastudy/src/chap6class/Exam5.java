package chap6class;

// SutdaCard 클래스 구현하기
// 멤버변수 : int num, boolean isKwang
// 멤버메서드 : toString()
// [결과]
// 3
// 1K
// isKwang이 true면 광 / K가 광이라는뜻
class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		num = 1;
		isKwang = true;
	}

	SutdaCard(int n, boolean isK) {
		num = n;
		isKwang = isK;
	}

	public String toString() {
		return num + ((isKwang) ? "K" : "");
	}
}

public class Exam5 {

	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, false); // 3인데 광이아님
		SutdaCard c2 = new SutdaCard();
		System.out.println(c1); // 3
		System.out.println(c2); // 1K 광임
	}

}
