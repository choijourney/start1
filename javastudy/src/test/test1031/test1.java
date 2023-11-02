package test.test1031;

/*1. Card 클래스가 다음과 같을때 구동 클래스를 완성하시오

[결과]
Heart:1(100,250)
Spade:1(100,250)
Heart:1(50,80)
Spade:1(50,80)
*/
class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;

	public String toString() {
		return kind + ":" + number + "(" + width + "," + height + ")";
	}
}

public class test1 {

	public static void main(String[] args) {
		Card card = new Card();
		Card[] c = new Card[2];
		c[0] = new Card();
		c[0].kind = "Heart";
		c[0].number = 1;
		c[1] = new Card();
		c[1].kind = "Spade";
		c[1].number = 1;
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

//		Card h = new Card();
//		h.kind = "Heart";
//		h.number = 1;
//		System.out.println(h);
//
//		Card s = new Card();
//		s.kind = "Spade";
//		s.number = 1;
//		System.out.println(s);
//
//		Card.width = 50;
//		Card.height = 80;
//		System.out.println(h);
//		System.out.println(s);

	}
}
