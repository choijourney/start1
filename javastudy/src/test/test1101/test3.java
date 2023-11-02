package test.test1101;

/*
구동 클래스를 실행 했을때 다음의 결과가 나오도록 Animal 클래스를 구현하기
[결과]
원숭이:26살
사자:1살
사람:100살
*/
class Animal {
	String name;
	int age;

	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Animal(String name) { // 사자
		this(name, 1); // 현재 객체의 생성자중 매개변수가 (String,int)인 생성자 호출
	}

	Animal(int age) {
		this("사람", age); // 현재 객체의 생성자중 매개변수가 (String,int)인 생성자 호출
	}

	void info() {
		System.out.println(name + ":" + age + "살");

	}
}

public class test3 {

	public static void main(String[] args) {
		Animal a1 = new Animal("원숭이", 26);
		Animal a2 = new Animal("사자");
		Animal a3 = new Animal(100);
		a1.info(); // info()메서드의 리턴타입:void
		a2.info();
		a3.info();

	}

}
