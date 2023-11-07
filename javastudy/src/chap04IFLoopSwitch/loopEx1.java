package chap04IFLoopSwitch;
// 자바의 반복문 3가지

// 반복문 : 조건문의 결과가 참인 동안 문장들을 반복 수행
// for(초기값; 조건문; 증감식;){
// 실행문장 ;}
// for구문 실행 순서
// 초기값  (한번만처리) -> 조건문 참 -> 실행문장  -> 증감식 -> 조건문 -> 증감식 -> 조건문
//						거짓 -> 반복문 종료

// while (조건문) {
// 실행문장 }
// while 구문 실행 순서
// 조건문 참 -> 실행문장  -> 조건문 -> 실행문
// 		거짓 -> 반복문 종료

// do{
// 실행문장 }
// while(조건문);
// do while 구문 실행 순서
// 실행문장 -> 조건문 참-> 실행문장
//				거짓-> 반복문 종료
public class loopEx1 {

	public static void main(String[] args) {
		// 1~ 5까지의 숫자를 출력하기

		System.out.println("for 구문을 이용하여 1~ 5까지 출력");

		// i 변수는 for구문 안에서만 사용가능한 지역변수
		for (int i = 1; i < 6; i++) {
			System.out.print(i);
		}
//		System.out.println(i); 지역변수라 for구문 밖에서 i를 쓰면 오류

		System.out.println();
		System.out.println("while문을 이용하여 1~ 5까지 출력");
		int i = 10;
		while (i < 6) {
			System.out.print(i);
			i++;
		}
		System.out.println();
		System.out.println("i=" + i);

		System.out.println("do while문을 이용하여 1~ 5까지 출력");
		i = 10;
		do {
			System.out.print(i);
			i++;
		} while (i < 6);
		System.out.println();
		System.out.println("i=" + i);
	}

}
