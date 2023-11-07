package chap08interface;

// 인터페이스
// 1. 인터페이스멤버 : 상수,추상메서드,default메서드, static메서드만 가능
// 생성자없음 
// 2. 인터페이스 접근제어자 : public만 가능
// 3. 객체화불가 => 구현클래스(인터페이스를 구현)의 객체화로 객체화
// 4. 클래스와 인터페이스는 구현으로 표현함. => implements 예약어 사용
// => 다중 구현 가능
// 5. 인터페이스간의 상속 가능 => 다중 상속 가능

// 인터페이스 멤버
// 상수 :[public static final이생략] int NUM =100; 정상작동 안쓰면 알아서 써줌
//  	[public static] final int NUM =100; 정상작동
//		protectd int NUM=100;  에러 
// 추상메서드 : [public abstract 생략]void method();  정상작동 안쓰면 알아서 써줌
//  		 [public 생략] abstract void method();  
// default 메서드 : 구현부가 있는 메서드, 인스턴스멤버
// static 메서드 : 구현부가 있는 메서드, 클래스멤버

// 참조자료형 : 배열, 클래스, 인터페이스
interface Printerable { // 변수처럼 생긴아이들은 모두 상수임
	int INK = 100; // 상수 public static final int INK =100; 에서 접근제어차들 생략

	void print(); // 추상메서드 {} 중괄호쓰면 에러남. 선언부만있어야함. public abstract void print();
}

interface Scannerable {
	void scan();
}

interface Faxable {
	String FAX_NO = "02-1111-2222";

	void send(String no);

	void reveive(String no);
}

// 인터페이스간의 상속 : 다중상속 가능
interface Complexerable extends Printerable, Scannerable, Faxable {
}

// 클래스간의 상속 : 단일상속
// 클래스와 인터페이스간의 구현 : 다중 구현 가능
// 구현클래스
class Complexer implements Complexerable {
	int ink;

	Complexer() {
		ink = INK;
	}

	@Override
	public void print() { // 접근제어자는 같거나 넓은 범위만 가능.
		System.out.println("프린트 출력합니다. 남은 잉크량: " + --ink);
	}

	@Override
	public void scan() {
		System.out.println("이미지를 스캔합니다.");

	}

	@Override
	public void send(String no) {
		System.out.println(FAX_NO + "에서 " + no + "로 FAX를 전송합니다.");

	}

	@Override
	public void reveive(String no) {
		System.out.println(no + "에서 " + FAX_NO + "로 FAX를 받았습니다.");
	}
}

public class InterfaceEx1 {

	public static void main(String[] args) {
//		Printable.INK=1000;  상수라서 값을 바꾸려고할때 오류
		System.out.println(Printerable.INK); // static이라 객체화없이 쓸수있음
		Complexer com = new Complexer();
		System.out.println("기본잉크량:" + Complexer.INK);
		System.out.println("기본잉크량:" + Complexerable.INK);
		System.out.println("기본잉크량:" + Printerable.INK);
		System.out.println("기본잉크량:" + Complexer.FAX_NO);
		System.out.println("기본잉크량:" + Complexerable.FAX_NO);
		System.out.println("기본잉크량:" + Faxable.FAX_NO);
		com.print();
		com.scan();
		com.reveive("02-2222-3333");
		com.send("02-3333-4444");
		System.out.println("남은잉크 :" + com.ink);
		if (com instanceof Complexerable) {
			System.out.println("com객체는 Complexerable 객체임");
			Complexerable c = com; // com을 Complexerable로 형변환
			c.print();
			c.scan();
			c.reveive("02-2222-3333");
			c.send("02-2222-3333");
//			System.out.println("남은잉크:"+c.ink);  ink는 Complexer타입으로만 접근가능
		}
		if (com instanceof Printerable) {
			System.out.println("com객체는 Printerable 객체임");
			Printerable p = com;
			p.print();
//			p.scan();			오류  Printerable 멤버가아니라서
//			p.reveive("02-2222-3333");
//			p.send("02-2222-3333");
//			System.out.println("남은잉크:"+p.ink);
		}
		if (com instanceof Scannerable) {
			System.out.println("com객체는 Scannerable 객체임");
			Scannerable s = com;
//			s.print();	오류
			s.scan();
//			s.reveive("02-2222-3333");
//			s.send("02-2222-3333");
//			System.out.println("남은잉크:"+s.ink);
		}
		if (com instanceof Faxable) {
			System.out.println("com객체는 Faxable 객체임");
			Faxable f = com;
//			f.print();  오류
//			f.scan();
			f.reveive("02-2222-3333");
			f.send("02-2222-3333");
//			System.out.println("남은잉크"+f.ink);
		}
	}

}
