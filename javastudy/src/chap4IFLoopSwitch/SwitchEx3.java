package chap4IFLoopSwitch;

// switch(조건값)
// 조건값으로 사용할 수 있는 자료형 : byte,short,char,int,String만 가능

public class SwitchEx3 {

	public static void main(String[] args) {
//		int v = 1; 	//정상
//		byte v=1;	//정상
//		short v =1;  //정상
//		long v =1L;  long은 안됨
//		char v = 'a'; //정상
//		double v= 1.0;  안됨
		String v = "abc"; // 정상
		switch (v) {
		default:
			System.out.println(v);
		}

		// 중첩 switch 구문
		int a = 1, b = 1;

		switch (a) {
		case 1:
			switch (b) {
			case 1:
				System.out.println("a=" + a);
				break;
			case 2:
				System.out.println("b=" + b);
				break;
			}
			break;
		}

	}

}
