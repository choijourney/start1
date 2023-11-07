package chap06class;

// 매개변수예제
// 기본형 매개변수
// 참조형 매개변수

class Value {
	int val;
}

public class ParameterEx1 {

	public static void main(String[] args) {
		Value v = new Value();
		v.val = 100;
		change1(v.val);
		System.out.println("change1 함수 호출 후 :" + v.val);
		change2(v);
		System.out.println("change2 함수 호출 후 :" + v.val);
	}

	private static void change1(int val) { // 기본형 매개변수는 객체원본의 값에 접근할 수 없고 변경할수 없다
		val += 100;
		System.out.println("change1함수:" + val);

	}

	private static void change2(Value v) { // 참조변수를 매개변수로 전달하면 객체원본의 값에 접근할수있고 변경할수있다
		v.val += 100;
		System.out.println("change2함수:" + v.val);
	}

}
