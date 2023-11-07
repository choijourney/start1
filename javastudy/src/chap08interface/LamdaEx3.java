package chap08interface;

// 매개변수, 리턴값이 모두 있는 경우
// (x,y)->{구현}
// 구현문장에 return문장만 있는 경우 {},return 생략가능
// 
interface LamdaInterface3 {
	int method(int x, int y);
}

public class LamdaEx3 {

	public static void main(String[] args) {
		LamdaInterface3 fi = (x, y) -> {
			return x * y;
		};
		System.out.println("두수의 곱:" + fi.method(2, 5));
		fi = (x, y) -> x * y; // 구현부에 return문장만 있는 경우 {},return 생략가능
		System.out.println("두수의 곱:" + fi.method(2, 5));
		fi = (x, y) -> x + y;
		System.out.println("두수의 합:" + fi.method(2, 5));
		fi = (x, y) -> (x > y) ? x : y;
		System.out.println("두수 중 큰값:" + fi.method(2, 5));
		fi = (x, y) -> (x < y) ? x : y;
		System.out.println("두수 중 작은값:" + fi.method(2, 5));
	}

}
