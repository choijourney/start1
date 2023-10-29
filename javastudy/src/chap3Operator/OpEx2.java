package chap3Operator;

// 단항 연산자 : 논리부정 연산자

// 		! : !true == false , !false == true
// 단항 연산자 : 부호 연산자
//    	+ :

public class OpEx2 {

	public static void main(String[] args) {

		System.out.println("true= " + !false);
		System.out.println("false= " + !true);
		System.out.println("5!=4 : " + !(5 != 4));
		System.out.println("5==4 : " + !(5 == 4));

		// 부호 연산자
		// + : 현재 부호를 유지 음수는 음수를 유지
		// - : 현재 부호를 변경. 음수인 경우 양수로 변경

		int x = -10;
		System.out.println("+x = " + +x); // -10
		System.out.println("-x = " + -x); // 10
		x = 10;
		System.out.println("+x = " + +x); // 10
		System.out.println("-x = " + -x); // -10
	}

}
