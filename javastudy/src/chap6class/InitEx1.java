package chap6class;

// 초기화 블럭 예제

// static 초기화블럭
// 		기능 : 클래스 변수의 초기화
//		실행시점: 클래스정보 로드시 한번 실행
// 인스턴스 초기화 블럭
//		기능 : 인스턴스 변수의 초기화. 생성자와 기능이 겹침
//		실행시점: 객체화시 생성자 호출전에 먼저 실행

public class InitEx1 {
	static int cv;
	int iv;

	InitEx1() {
		System.out.println("5.생성자 호출됨");
	}

	// static 초기화 블럭 / 제일 처음 실행됨. 메인이 만들어지기전에 실행.
	static {
		cv = (int) (Math.random() * 100);
		System.out.println("1.static 초기화 블럭 실행. cv=" + cv);
	}

	// 인스턴스 초기화 블럭 (많이쓰진않는다 생성자를 씀) 생성자보다 먼저 실행됨
	{
		iv = cv = (int) (Math.random() * 100);
		System.out.println("4.인스턴스 초기화 블럭 실행. iv=" + iv);
	}

	public static void main(String[] args) {
		System.out.println("2. main 메서드 시작");
		System.out.println("3. main 메서드에서 init1 객체 생성 cv" + cv);
		InitEx1 init1 = new InitEx1();
		System.out.println("3. main 메서드에서 init2 객체 생성 cv" + cv);
		InitEx1 init2 = new InitEx1();
		System.out.println(init1.iv);
		System.out.println(init2.iv);
	}

}
