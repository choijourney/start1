package test1101;

/*
 * Test2.java 소스의 Coin 클래스를 이용하기.
 * 두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
 * 앞면이 연속해서 3번 나오면 승리. => myCoin 승리, youCoin 승리, 비김.
 * [결과]
 * myCoin	youCoin
 * 앞면	앞면
 * 뒷면	앞면
 * 앞면	뒷면
 * 뒷면	앞면
 * 뒷면	앞면
 * 앞면	앞면
 * youCoin 승리  
 */
public class test5 {

	public static void main(String[] args) { // flip실행하면 side가 0이나1로 리턴해줌
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();

		String zero = "";
		String zero2 = "";
//		zero += 0;
//		zero += 0;
//		System.out.println(zero);
		System.out.printf("myCoin\tyouCoin\n");
		while (true) {
			myCoin.flip();
			youCoin.flip();
			System.out.printf((myCoin.side == 0 ? "앞면\t" : "뒷면\t") + (youCoin.side == 0 ? "앞면\n" : "뒷면\n"));
			if (myCoin.side == 0) {
				zero += 0;
			} else if (youCoin.side == 0) {
				zero2 += "앞면";
			}

			if (zero.contains("앞면앞면앞면")) {
				System.out.println("myCoin 승리");
				break;
			} else if (zero2.contains("앞면앞면앞면")) {
				System.out.println("youCoin 승리");
				break;
			} else if (zero.contains("앞면앞면앞면") && zero2.contains("앞면앞면앞면")) {
				System.out.println("비김");
				break;
			}
		}

	}
}