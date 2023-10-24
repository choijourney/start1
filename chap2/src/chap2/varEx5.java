package chap2;

// 다른 자료형 사이의 연산의 결과 자료형
// 큰자료형  <=  큰 자료형 + 작은 자료형
// int형보다 작은 자료형의 연산의 결과는 int형임.
public class varEx5 {

	public static void main(String[] args) {
		int i1 = 100;
		int i2 = 200;
		int i3 = i1 + i2; // 300
		float f1 = 10.0f;
		float f2 = i3 + f1; // 310.0 float <= int + float
//		float d1 = f1 + 10.5; // 20.5    10.5는 double이라서 더하면 double이 되기때문에 float에 넣으면 오류남

		System.out.println("i3=" + i3);
		System.out.println("f2=" + f2);
//		System.out.println("d1=" + d1);

		byte b1 = 10;
		short b2 = 20;
//		short b3= b1+b2;  
		// int보다 작은 형을 더하기 하면 int로 자동변환된다
		// byte + byte = int
		// byte + short = int
		short b3 = (short) (b1 + b2);
//		short b4 = (short)b1+b2;

		char c1 = 'a';
//		char c2 = c1+1;   int로 자동변환
		int c2 = c1 + 1;

	}

}
