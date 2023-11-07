package chap09innerClassEnum;

// 열거형

public class EnumEx1 {
	public enum Car { // 열거형 객체
		AVANTE, SONATA, GRANDEUR, SM5, K7, K9 // 미리 객체를 생성하여 설정
	}

	public static void main(String[] args) {
		Car car = Car.AVANTE;
		System.out.println(car);
		System.out.println(Car.K9);
		Car[] cars = Car.values(); // Car.values() Car객체의 값을 가져옴
		for (Car c : cars) {
			// c.ordinal() : 열거형 객체의 순서를 알려줌 0부터 시작. 인덱스비슷
			System.out.println(c + ":" + c.ordinal());
		}
		if (car instanceof Object)
			System.out.println("car객체는 Object 객체다");
	}

}
