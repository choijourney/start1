package chap06class;

// Rectangle 클래스 생성하기
// 멤버변수 : 가로(width), 세로(height),사각형번호(cnt),생성된 사각형개수 (cnt)
// 멤버메서드 : 넓이(area),둘레(length) 출력
// toString : 1번사각형:가로(10),세로(20),생성된사각형개수(1)

// @@ 참조변수를 출력하면 메서드를 따로쓰지않아도 메서드가 작동함 @@

class Rectangle2 {
	int width; // 인스턴스변수는 객체가 따로 만들어지기때문에 값을 업데이트해도 다른객체에 영향을주지않음
	int height;
	int sno;
	static int cnt; // static변수는 클래스객체에 하나만 존재하기때문에 값을 업데이트하면 연결된 모든 객체에 영향줌

	void areaLen() {
		System.out.println("넓이는 " + width * height);
		System.out.println("둘레는 " + (width + height) * 2);
	}

	public String toString() { // public을 꼭써야함 toString 메서드를 재정의해서그런거같음
		return sno + "번 사각형: 가로(" + width + "),세로(" + height + "),생성된 사각형 개수(" + cnt + ")";
	}
}

public class Exam2 {

	public static void main(String[] args) {
		Rectangle2 r1 = new Rectangle2();
		// 가로,세로: 10,20인 1번 사각형 객체를 생성하여 r1참조변수에 저장
		// 1번 사각형의 넓이,둘레 출력
		// 1번 사각형의 정보를 출력하기
		r1.width = 10;
		r1.height = 20;
		r1.sno = ++Rectangle2.cnt; // sno에 숫자1을 저장하고 cnt는 값을 1 증가
		r1.areaLen();
		System.out.println(r1); // 참조변수를 출력하면 메서드를 따로쓰지않아도 toString 메서드 작동함

		// 가로,세로: 20,30인 2번 사각형 객체를 생성하여 r2 참조변수에 저장
		Rectangle2 r2 = new Rectangle2();
		r2.width = 20;
		r2.height = 30;
		r2.sno = ++Rectangle2.cnt; // sno에 숫자2을 저장하고 cnt는 2가됨
		r2.areaLen();
		System.out.println(r2);
		System.out.println(r1); // 생성된 사각형의 개수 2

	}

}
