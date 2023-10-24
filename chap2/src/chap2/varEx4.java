package chap2;

// 형변환 예제 1
// 자바의 자료형
// 기본자료형
// 	- 논리형 : boolean (1byte)
//  - 문자형 : char (2byte)
//  - 정수형 : byte (1byte), short (2byte), int (4byte), long (8byte)
//  - 실수형 : float (4byte) , double (8byte)
// 참조자료형
//  - 배열(array)
// 	-클래스 (class)
// 	-인터페이스 (interface)

// 형변환
// 1. 기본자료형 중 boolean을 제외한 7개의 자료형은 형변환 가능함
// 2. 기본자료형과 참조자료형은 형변환 불가(Wrapper class는 예외.)  char -> String 불가
// 3. 자동형변환 : 형변환 연산자 생략 가능. 작은자료형 -> 큰자료형으로 변환할때 
//	  명시적형변환 : 형변환 연산자 생략 불가. 큰자료형 -> 작은자료형
// 4. float = long  : 자동형변환
// 5. long = float : 명시적형변환 
public class varEx4 {

	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40; // 8바이트
		float f = 50; // 정수형이 float타입으로 형변환 4바이트
		double d = 60; // 정수형이 double타입으로 형변환

		b = 127; // byte형에는 -128~ 127 까지 숫자만 저장 가능

		// (타입) : 형변환 연산자
		b = (byte) 128; // 꼭 byte에 128을 넣고싶으면 형변환
		// 값이 잘려서 달라짐 -128 출력

		s = 128;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);

		// 큰자료형 -> 작은자료형 변환 : 명시적 형변환 , 형변환 연산자 필수
		s = (short) i; // int를 short형으로 강제형변환 30출력 답이잘리진않음
		System.out.println(s);
		l = (long) f; // float을 long으로 강제형변환

		// 작은자료형 -> 큰자료형 변환 : 자동형변환
		l = (long) i;

		// 실수형 리터럴은 기본이 double이라 f를 뒤에 붙여주거나 (float)으로
		// 형변환해야함

		f = 10.0f; // float형 리터럴
		f = (float) 10.0;
		d = 20.0d; // double형 리터럴
		l = 100L; // long형 리터럴

	}

}
