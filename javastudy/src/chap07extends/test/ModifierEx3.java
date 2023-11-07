package chap07extends.test;

public class ModifierEx3 {

	public static void main(String[] args) {
		// Modifier3 클래스의 접근제어자가 default임.
		// 다른 패키지에서 클래스에 접근 불가
//		chap7extends.Modifier3 m3 = new chap7extends.Modifier3();
//		m3.method();
		// ModifierEx2 클래스의 접근제어자가 public임
		// 다른패키지에서 접근 허용
		chap07extends.ModifierEx2 m2 = new chap07extends.ModifierEx2();
	}

}
