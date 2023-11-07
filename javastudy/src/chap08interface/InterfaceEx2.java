package chap08interface;

// 단일 상속의 보완적인 의미로 인터페이스 사용

abstract class Animal {
	String name;

	Animal(String name) {
		this.name = name;
	}

	abstract void eat();
}

interface Flyable {
	void fly();
}

class Dove extends Animal implements Flyable {
	Dove() {
		super("비둘기");
	}

	void eat() {
		System.out.println("벌레를 잡아먹는다.");
	}

	@Override
	public void fly() { // interface를 구현한거라 public 필수
		System.out.println(name + "는 날아다닌다");

	}
}

class Monkey extends Animal {
	public Monkey() {
		super("원숭이");
	}

	@Override
	void eat() {
		System.out.println("나무에서 열매를 따먹는다");
	}

}

public class InterfaceEx2 {

	public static void main(String[] args) {
		Animal[] arr = new Animal[2];
		arr[0] = new Dove();
		arr[1] = new Monkey();
		for (Animal a : arr) {
			a.eat();
//			a.fly();  fly가 Animal클래스의 멤버가 아니어서 오류
			// 비둘기는 날아다닌다 메세지 출력하기 fly메서드 호출하기
			if (a instanceof Flyable) { // Monkey는 Flyable타입으로 형변환이 되지않기때문에 instanceof를 꼭 써야함
//				Flyable f = (Flyable) a;  형변환후 f.fly 사용가능
//				f.fly();
				((Flyable) a).fly(); // 위 두줄을 한번에 씀
			}
		}

	}

}
