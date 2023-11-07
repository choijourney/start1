package chap11;

// Object클래스 : equals 메서드
// equals 메서드 : Object클래스의 equals메서드는 같은 객체인지 비교함.
//	 => 내용비교를 위해서는 equals 메서드를 오버라이딩 해야함. String의 equals는 이미 내용비교를 하도록 오버라이딩돼있음
// == : 같은 객체여부 리턴 
class Equal {
	int value;

	Equal(int value) {
		this.value = value;
	}
	// Equal 객체의 내용을 비교하기 위해서 equals 메서드를 오버라이딩 해야함

	@Override
	public boolean equals(Object obj) { // Object로 형변환됐다가
		if (obj instanceof Equal) {
			Equal e = (Equal) obj; // Equal로 형변환해서 값을 변수에 저장
			return value == e.value; // true
		} else
			return false;
	}

}

public class ObjectEx1equals {

	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		if (e1 == e2)
			System.out.println("e1과 e2 객체는 같은 객체임");
		else
			System.out.println("e1과 e2 객체는 다른 객체임");
		if (e1.equals(e2))
			System.out.println("e1과 e2 객체는 같은 내용의 객체임");
		else
			System.out.println("e1과 e2 객체는 다른 내용의 객체임");
	}

}
