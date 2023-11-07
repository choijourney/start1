package chap09innerClassEnum;

// 외부클래스의 private 멤버를 중첩 클래스에서 접근

class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;

	class InstanceInner {
		int iiv = outeriv;
		int iiv2 = outercv;
	}

	static class StaticInner {
//		int siv=outeriv;   StaticInner가 클래스멤버라 인스턴스멤버를 바로 호출할수없고 객체화를 시켜야함
		int siv = new Outer2().outeriv;
		static int scv = outercv;
		int siv2 = outercv;
	}

	// LocalInner.method()호출하기
	void method(int pv) { // pv=30
		int max = 1000; // 지역변수
//		max++;  값을 변경하면 안됨 
		class LocalInner {
			int liv = outeriv;
			int liv2 = outercv;
// 지역중첩클래스의 멤버메서드에서 외부메서드의 지역변수는 상수화 되어야한다
// 지역변수의 변경이 없는 경우는 상수로 판단함
// 지역변수의 변경이 되는 경우는 오류 발생			

			void method(int num) { // LocalInner의 멤버 메서드
				num = 3;
				System.out.println("outeriv=" + outeriv); // 10
				System.out.println("outercv=" + outercv); // 20
				System.out.println("liv=" + liv); // 10
				System.out.println("liv2=" + liv2); // 20
				num = liv + liv2;
				System.out.println("num=" + num); // 30
//				pv= outeriv+outercv;  지역변수인 pv는 변경할수없음
				System.out.println("pv=" + pv); // 30
				System.out.println("max=" + max); // 1000
			}
		}
		LocalInner li = new LocalInner();
		li.method(3);
	}
}

public class InnerEx2 {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
//		System.out.println(out.outeriv); // InnerEx2 클래스에서 Outer2의 private멤버 접근 불가
//		System.out.println(out.outercv); // Outer2의 내부클래스에서만 private멤버 접근가능
		out.method(30);

		// InstanceInner, StaticInner의 멤버변수를 화면 출력하기
		Outer2.InstanceInner ic = out.new InstanceInner();
		Outer2.StaticInner sc = new Outer2.StaticInner(); // static 중첩클래스도 그안에 인스턴스멤버를 사용하려면 객체를 만들어야함
		System.out.println(ic.iiv);
		System.out.println(ic.iiv2);

		System.out.println(Outer2.StaticInner.scv); // static멤버
		System.out.println(sc.siv); // 인스턴스멤버
		System.out.println(sc.siv2);// 인스턴스멤버

	}

}
