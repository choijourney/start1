package chap05array;

public class arrayEx1 {

	public static void main(String[] args) { // 배열이 업데이트가 된다??

		// 배열 : 하나의 이름으로 여러개의 값을 저장. 같은 자료형이어야함.
		// 구조체 하나의 이름으로 여러개의 갑을 저장. 다른 자료형 가능함.

		// 참조 변수 : 객체를 참조할 수 있는 변수 ( 객체의 위치값을 가지고 있는 번지)
		// 일회용 객체 빼고는 모든 객체는 참조 변수가 필요하다

		int[] arr; // 참조변수 선언
		arr = new int[5]; // 배열 객체 생성. int형 5개 변수가 생성
		arr[0] = 10; // 배열 값 저장
		arr[1] = 20;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]" + arr[i]);
		}

		// new 예약어
		// 1. 객체 생성. int 값 10개 저장할 수 있는 변수를 할당. heightgth상수값 설정
		// 2. 기본값 초기화
		// 숫자형 : 0
		// 불리언 : false
		// 그 외 : null

		// 배열 선언 + 객체 생성
		int[] arr2 = new int[3];
		// 배열 값 저장
		arr2[0] = 100;
		arr2[1] = 200;

		// 배열 조회
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		}

		// 배열 값 변경 @@@ arr2가 arr의 객체를 참조함 원래 갖고있던 객체는 쓰레기가됨
		arr2 = arr;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		}

		arr[3] = 1000; // arr[3] 을 바꿨는데 arr2의 [3]값도 바뀌어있다
		System.out.println("arr[3]=1000 실행 후=====");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		}

		// 개선된 for 구문
		// 인덱스(첨자 사용 안됨) : 요소의 값만 사용 가능
		// 인덱스 사용의 필요한 경우 기존for문 사용해야함
		for (int a : arr) {
			System.out.println(a);
		}

	}

}
