package test.test1103;

/*
 * SutdaCard 클래스
 *   멤버변수 : final int number,final boolean  isKwang
 *   생성자 : 멤버변수를 매개변수로 입력받아 초기화
 *   멤버메서드 : toString을 결과에 맞도록 오버라이딩하기
 * SutdaDeck 클래스 구현하기
 *  멤버변수 : cards : SutdaCard 20장을 저장할 배열
 *  생성자 : SutdaCard 20장을 생성하여 cards 배열에 저장
 *  메서드 : toString() 오버라이딩하여 결과가 출력되도록 구현
  [결과]    
  1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,
 */
class SutdaCard {
	final int number;
	final boolean isKwang;

	public SutdaCard(int number, boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
	}

	public String toString() {
		return number + ((isKwang) ? "K" : "");
	}
}

class SutdaDeck {
	String[] cards = new String[20];
//	SutdaCard sutdaCard =new SutdaCard();

	public SutdaDeck() {
		int cnt = 1;
		for (int i = 0; i < cards.length; i++) {
			cards[i] = String.valueOf(cnt++);
			if (cnt == 11) {
				cnt = 1;
			}

		}
	}

	String result = ""; // String result; 이렇게써서 초기값 null이 출력됨

	public String toString() {
		for (int i = 0; i < cards.length; i++) {
			result += cards[i] + ",";
			if (i < 10 && cards[i] == "3" && cards[i] == "1" && cards[i] == "8") {
				result += "K";
			}
		}
		return result;
	}
}

public class test3 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck);
	}
}