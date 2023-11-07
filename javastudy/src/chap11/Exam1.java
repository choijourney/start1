package chap11;
// 오른쪽마우스 - source - generate constructor field 생성자자동완성

//  source - override - equals, toStiring 등 Object의 메서드들있음
//  source - generate toString   toString 자동오버라이딩

// 결과
// 다른카드임
// 같은종류의 카드임

class Card {
	String kind;
	int number;

	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) { // 객체의 내용을 비교하도록 오버라이딩함
		if (obj instanceof Card) {
			Card c = (Card) obj; // Card로 형변환해서 값을 변수에저장
			return number == c.number && kind.equals(c.kind);
		} else
			return false;
	}

	// toString 메서드 오버라이딩
	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}

}

public class Exam1 {

	public static void main(String[] args) {
		Card c1 = new Card("Spade", 1);
		Card c2 = new Card("Spade", 1);
		if (c1 == c2)
			System.out.println("같은 카드임");
		else
			System.out.println("다른 카드임");
		if (c1.equals(c2)) // equals메서드를 오버라이딩해서 객체의 내용을 비교
			System.out.println("같은 종류의 카드임");
		else
			System.out.println("다른 종류의 카드임");
	}

}
