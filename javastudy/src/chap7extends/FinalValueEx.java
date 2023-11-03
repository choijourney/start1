package chap7extends;

// final 변수 : 변경불가 변수 => 상수  goto,const예약어가 있는데 사용안함 (변수로 쓸수없음)
//		상수명명권장 : 대문자로 표시

class FinalValue {
	final int NUM; // 상수는 초기화 안하면 에러

	FinalValue(int num) { // 생성자에서 초기화를 해주면 정상작동
		this.NUM = num; // 명시적초기화가 안된 경우, 생성자에서 한번은 초기화 가능.
	} // 생성자에서 값 초기화 가능하게 헀을때 객체별로 다른 상수값 가능.
}

public class FinalValueEx {
	public static void main(String[] args) {
		final int NUM = 100;
//		NUM=200;  값을바꿀수없음
		System.out.println(NUM);
		System.out.println(Math.PI); // PI는 상수

		final int MAX; // 초기화 하지않은 경우 한번은 변경 가능
		MAX = 100; // 정상
//		MAX=100; 여기선 오류
		System.out.println(MAX); // 지역변수는 초기화 필수

		FinalValue fv1 = new FinalValue(10); // 객체마다 생성자로 다른 상수값을 초기화 가능
//		fv1.NUM = 200;  상수 변경불가
		FinalValue fv2 = new FinalValue(20);
		System.out.println("fv1.NUM:" + fv1.NUM);
		System.out.println("fv2.NUM:" + fv2.NUM);

		// final 배열
		final int[] arr = { 10, 20, 30, 40, 50 };
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		arr[0] = 100;
		arr[1] = 200;
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println(); // 값 변경 돼서 100 200 30 40 50 정상출력

//		arr= new int[] {100,200,300}; // arr에 새로운 배열객체로 변경불가
		// 객체전체값이 상수가 되는게아니라 참조번지만 상수가 된다.

	}
}
