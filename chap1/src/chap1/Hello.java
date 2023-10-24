package chap1;
// 주석 : 컴파일 되지 않는 영역, 기계어 번역 안됨

// 문법과 상관없이 소스의 설명등을 기술함
/* 여러줄 주석  */
// 한줄 주석
// 1. 소스 코딩 : Hello.java
// 2. 컴파일 단계 : javac Hello.java => 바이트 코드 생성 (Hello.class)
// 				javac : 자바 컴파일러
// 3. 실행 단계 : java Hello => 바이트코드 실행.
// 				java : 자바 인터프리터	가 하는일
//				- 자바가상머신(JVM) 환경 생성
//				- 바이트코드를 메모리에 로드함. 바이트코드 여부 검증
//				- main 메서드를 찾아서 실행

// 변수 : 값을 저장하는 메모리공간.
// 기본자료형 : boolean (1바이트), char(2바이트), byte(1바이트), short(2) , int (4), 
// long(8), float(4), double(8)
// 불리언 빼고 나머지 7개의 기본형은 서로 형변환이 가능하다. int -> double 이런식.

// 참조자료형 : 배열 , 클래스 , 인터페이스 
// 예약어는 쓰지않는게 좋지만 혹시 쓸거면 첫글자를 대문자로 씀
public class Hello {

	public static void main(String[] args) { // 프로그램의 시작.
		System.out.println("Hello World");
		System.out.println("Hello Java");
		// System.out : 표준 출력 => 콘솔(화면) 출력

		int x, y, z; // 한번에 선언가능
	}

}
