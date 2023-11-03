package chap7extends;

// 접근제어자 : private < (default) < protected < public
// 멤버변수,멤버메서드: private < (default) < protected < public 모두사용가능
// 클래스 : (default) < public 두개만사용가능
//		(default) 클래스 : 같은 패키지내에서만 접근 허용
//		public 클래스 : 그외 접근 허용
import chap7extends.test.Modifier2;
// chap7extends.Modifier3
// chap7extends.test.Modifier2

class Modifier3 extends Modifier2 { // default클래스 같은패키지내에서만 접근가능
	public void method() { // v1,v2,v3,v4 는 Modifier2에서 물려받은 변수
		System.out.println("chap7.Modifier3 클래스의 method");
//		System.out.println("v1="+v1); // private접근제어자. Modifier2 클래스내부에서만 접근가능
//		System.out.println("v2="+v2); // default접근제어자. chap7extends.test 패키지 내부의 클래스에서만 접근가능
		System.out.println("v3=" + v3); // protected접근제어자. Modifier3가 Modifier2의 하위클래스라서 접근가능
		System.out.println("v4=" + v4); // public접근제어자. 어느 패키지에서든 접근가능
	}
}

public class ModifierEx2 { // chap7extends.ModifierEx2

	public static void main(String[] args) {
		Modifier2 m2 = new Modifier2(); // chap7extends.test.Modifier2 다른패키지에 있어서 import함
		m2.method(); // public 제어자이므로 정상
//		System.out.println(m2.v1); // Modifier2클래스 내에서만 접근 허용 private임
//		System.out.println(m2.v2); // chap7extends.test 패키지 내부의 클래스에서만 접근 허용. default임
//		System.out.println(m2.v3); // 상속관계에서만 접근 허용 protected
		System.out.println(m2.v4); // public 제어자이므로 정상

		Modifier2 m3 = new Modifier3();
		m3.method();
	}

}
