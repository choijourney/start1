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
public class test5coingame {

	public static void main(String[] args) { // flip실행하면 side가 0이나1로 리턴해줌
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();
		String zero = "";
		String zero2 = "";

		System.out.printf("myCoin\tyouCoin\n");
		while (true) {
			myCoin.flip();
			youCoin.flip();
			System.out.printf((myCoin.side == 0 ? "앞면\t" : "뒷면\t") + (youCoin.side == 0 ? "앞면\n" : "뒷면\n"));
			if (myCoin.side == 0) { // myCoin이 앞면이면 zero에 0을, 뒷면이면 1을 추가.
				zero += 0;
			} else {
				zero += 1;
			}
			if (youCoin.side == 0) {
				zero2 += 0;
			} else {
				zero2 += 1;
			}
			// 0이 연속으로 나왔는지 확인
			if (zero.contains("000") && zero2.contains("000")) {
				System.out.println("비김"); // 비기는게 먼저와야함. 이기는게 앞코드에있으면 비겨도 비기는게 실행안함
				break;
			} else if (zero.contains("000")) {
				System.out.println("myCoin 승리");
				break;
			} else if (zero2.contains("000")) {
				System.out.println("youCoin 승리");
				break;
			}
		}

		// 방식 2.
//		Coin myCoin = new Coin();
//		Coin youCoin = new Coin();
//		int mycnt = 0, youcnt = 0; //앞면의 갯수
//		System.out.println("myCoin\tyouCoin");
//		while(true){
//			myCoin.flip(); //동전의 side값 변경
//			youCoin.flip();//동전의 side값 변경 
//			if(myCoin.side == 0){ //myCoin 객체의 side가 앞면
//				System.out.print("앞면\t");
//				mycnt++;
//			}else{ //myCoin 객체의 side가 뒷면
//				System.out.print("뒷면\t");
//				mycnt = 0;
//			}			
//			if(youCoin.side == 0){ //youCoin 객체의 side가 앞면
//				System.out.print("앞면\n");
//				youcnt++;
//			}else{ //youCoin 객체의 side가 뒷면
//				System.out.print("뒷면\n");
//				youcnt = 0;
//			}			
//			if(mycnt == 3 || youcnt == 3) break;  //반복문 종료 
//		}
//		System.out.println((mycnt > youcnt)?"myCoin 승리":
//			               (mycnt < youcnt)?"youCoin 승리":"비김");
	}
}
