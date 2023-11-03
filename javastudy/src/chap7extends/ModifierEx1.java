package chap7extends;

// 제어자(제한자) : 접근 제어자, 그 외 제어자
// 접근제어자 : private < (default) < protected < public
// 그 외 제어자 : static, abstract, final

class Modifier {
	private int v1 = 100; // Modifier 클래스 내에서만 접근 허용
	int v2 = 200; // default 제어자. chap7extends 패키지에서 접근 허용
	protected int v3 = 300; // 같은패키지와 다른패키지이지만 자식클래스인경우 접근허용
	public int v4 = 400;

	public void method() {
		System.out.println("chap7.Modifier 클래스의 메서드");
		System.out.println("v1=" + v1); // 같은클래스여서 private인 v1에 접근가능
		System.out.println("v2=" + v2);
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);
	}
}

public class ModifierEx1 {

	public static void main(String[] args) {
		Modifier m = new Modifier();
		m.method();
//		System.out.println(m.v1);  private이라 같은 클래스 내에서만 접근 가능하기때문에 접근불가.
		System.out.println(m.v2);
		System.out.println(m.v3);
		System.out.println(m.v4);
	}

}
