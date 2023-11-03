package chap7extends;

// 생성자의 접근제어자를 private로 => 객체를 한개만 생성
// 생성자에 protected 제어자를 사용할수도있음
class SingleObject {
	private static SingleObject obj = new SingleObject();

	private SingleObject() {
	} // 생성자

	int value = 100;

	public static SingleObject getObject() {
		return obj;
	}
}

public class SingletodEx1 {

	public static void main(String[] args) {
//		SingleObject o =new SingleObject(); =>생성자가 private이라 접근 불가.
		SingleObject o1 = SingleObject.getObject();
		System.out.println(o1.value); // 100
		SingleObject o2 = SingleObject.getObject();
		System.out.println(o2.value); // 100
		o1.value = 200;
		System.out.println(o1.value); // 200 o1,o2는 같은객체를 참조해서 o1값을 변경하면 o2값도변경됨
		System.out.println(o2.value); // 200
	}

}
