package test.test1101;

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
public class test5$ {

	public static void main(String[] args) {
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();
		System.out.println("my Coin\tyou Coin");
		int mycnt = 0;
		int youcnt = 0;
		while (true) {
			myCoin.flip();
			youCoin.flip();

			if (myCoin.side == 0) {
				mycnt++;
				System.out.print("앞면\t");
			} else {
				mycnt = 0;
				System.out.print("뒷면\t");
			}
			if (youCoin.side == 0) {
				youcnt++;
				System.out.print("앞면\n");
			} else {
				youcnt = 0;
				System.out.print("뒷면\n");
			}
			if (mycnt == 3 || youcnt == 3) {
				break;
			}
		}

		System.out.println((mycnt == 3 ? "myCoin 승리" : youcnt == 3 ? "youCoin 승리" : "비김"));

	}

}
