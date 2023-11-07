package chap07extends;

// Buyer 클래스
// 멤버변수 : money =500, point
// 		Product[] items = new Product[5] => 장바구니,
//		int cnt => 구매개수
// 멤버메서드 : 
// void buy(Product p)
// 		1. p상품의 가격을 money에서 차감
//		2. p상품의 포인트만큼 point에 증가
//		3. items에 p상품을 추가, cnt 증가
//		4. p상품의 이름을 출력. 예) Tv구입 

// void summary()
// 1.구매제품 전체의 금액합계,포인트합계 출력
// 2.현재남아있는 잔액 출력
// 3.전체 구매 물품 이름 출력
class Buyer {
	int money = 500;
	int point;
	Product[] items = new Product[5];
	static int cnt;

	void buy(Product p) {
		money -= p.price; // p상품의 가격을 money에서 차감
		point += p.point; // p상품의 포인트만큼 point에 증가
		items[cnt++] = p; // cnt 0부터 증가로 인덱스처럼 사용해서 배열에 p를 추가.(구매제품을 배열에 추가)
		System.out.println(p + "구입"); // toString을 안써도 자동작동
	}

	void summary() {
		int totPrice = 0, totPoint = 0;

		for (int i = 0; i < cnt; i++) {
			totPrice += items[i].price;
			totPoint += items[i].point;
		}
		System.out.println("구매제품 전체의 금액합계:" + totPrice + ", 포인트합계: " + totPoint);
		System.out.println("현재잔액:" + money);
		System.out.println("전체 구매 물품 목록");
		for (int i = 0; i < cnt; i++) { // cnt 대신 items.length를 쓰면 배열을 다채우지않아서 오류남
			System.out.print(items[i] + ",");
		}
		System.out.println();
	}
}

public class Exam2buyer {

	public static void main(String[] args) {
		Tv t = new Tv();
		Computer c = new Computer();
		HandPhone h = new HandPhone();
		Buyer b = new Buyer();
		b.buy(t);
		b.buy(c);
		b.buy(h);
		b.summary(); // b객체가 하나라서 money도 하나이니까 money에서 구매한제품의 금액이 차감돼서 현재금액은 50
		System.out.println("main Buyer 잔액:" + b.money);
		System.out.println("main Buyer 포인트:" + b.point);

	}

}
