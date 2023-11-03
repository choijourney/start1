package test.test1102;

// test2.java의 클래스를 이용하기
// Buyer 클래스 구현하기
// 멤버변수 : money=10000;
//			point ,구매건수 cnt , 장바구니 cart= new Food[10]
// 멤버메서드 :
// void buy(Food)
//	1.현재잔액보다 물품값이 큰경우는 잔액부족 메시지 출력하고 메서드 종료
//  2.보유금액에서 물품가격만큼 차감
//  3. 물품의 포인트만큼 포인트를 증가
//  4. 물품명과 가격을 출력
//  5. 장바구니 cart에 구매물품추가. cnt 1증가

// void summary(){
//1. cart 상품을 조회하여 구매한 물품의 목록 출력
//2. cart 상품을 조회하여 구매한 물품의 가격,포인트 합계 출력
//3. 구매한 상품 중 과일의 개수, 과일구매금액, 과일구매 목록 출력
//4. 구매한 상품 중 음료의 개수, 음료구매금액, 음료구매 목록 출력
//5. 구매한 상품 중 과자의 개수, 과자구매금액, 과자구매 목록 출력
//6. 현재잔액과 포인트 출력하기
class Buyer {
	int money = 10000;
	int point, cnt;
	Food[] cart = new Food[10];

	void buy(Food f) {
		if (f.price > money) {
			System.out.println("잔액부족");
			return;
		}
		money -= f.price;
		this.point += f.point;
		System.out.println(f + "구입 가격: " + f.price);
		cart[cnt++] = f;
	}

	void summary() {
		int priceSum = 0, pointSum = 0;
		for (int i = 0; i < cnt; i++) {
			System.out.println("구매한물품 목록:" + cart[i]);
			priceSum += cart[i].price;
			pointSum += cart[i].point;
		}

		System.out.println("구매한 물품의 가격 합계:" + priceSum + " 구매한 물품의 포인트 합계:" + pointSum);
		int fcnt = 0, fprice = 0, dcnt = 0, dprice = 0, scnt = 0, sprice = 0;
		String flist = "", dlist = "", slist = "";
		// 과일
		for (int i = 0; i < cnt; i++) {
			if (cart[i] instanceof Fruit) { // cart[i]가 Fruit의 하위객체면
				fcnt++;
				fprice += cart[i].price;
				flist += cart[i] + ","; // toString 기능으로 구매물품이름을 String ""에더해서 저장
			}
		}

		// 음료
		for (int i = 0; i < cnt; i++) {
			if (cart[i] instanceof Drink) {
				dcnt++;
				dprice += cart[i].price;
				dlist += cart[i] + ",";
			}
		}
		// 스낵
		for (int i = 0; i < cnt; i++) {
			if (cart[i] instanceof Snack) {
				scnt++;
				sprice += cart[i].price;
				slist += cart[i] + ",";
			}
		}
		System.out.println("과일의 개수:" + fcnt + ",과일 구매 금액:" + fprice + ",과일 구매 목록:" + flist);
		System.out.println("음료의 개수:" + dcnt + ",음료 구매 금액:" + dprice + ",음료 구매 목록:" + dlist);
		System.out.println("과자의 개수:" + scnt + ",과자 구매 금액:" + sprice + ",과자 구매 목록:" + slist);
		System.out.println("현재잔액:" + money + ", 포인트:" + point);
	}
}

public class test3 {

	public static void main(String[] args) {
		Apple apple = new Apple(1000, 10.5);// 가격, 당도(brix)
		System.out.println("사과 가격:" + apple.price);
		System.out.println("사과 당도:" + apple.brix);
		Peach peach = new Peach(1000, 13.5);// 가격, 당도(brix)
		Cock cock = new Cock(500, 500); // 가격, 용량(ml)
		Sidar sidar = new Sidar(1500, 1000);// 가격, 용량(ml)
		Biscuit bis = new Biscuit(10000, 500);// 가격, 무게(gram)
		Cookie cookie = new Cookie(500, 5000);// 가격, 무게(gram)

		// Buyer 클래스 객체 생성
		Buyer b = new Buyer();
		// b.buy함수 호출
		b.buy(apple);
		b.buy(peach);
		b.buy(cock);
		b.buy(sidar);
		b.buy(bis);
		b.buy(cookie);
		b.summary();
	}

}
