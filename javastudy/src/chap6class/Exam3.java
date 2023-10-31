package chap6class;

// Exam2.java 소스의 Rectangle2 클래스를 이용하여 구동클래스 구현하기
// 가로,세로 길이가 20~50 사이인 임의의 길이를 가진 사각형 5개를 생성하고
// 각각의 넓이,둘레,정보 출력하기
// 배열을 이용함  객체도 배열에 저장할수있음@@
public class Exam3 {

	public static void main(String[] args) {
		// arr: Rectangle2 객체를 참조할 참조변수 5개를 배열로 저장함.
		Rectangle2[] arr = new Rectangle2[5]; // 객체를 만든게 아니라 참조변수만 만듦
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Rectangle2(); // 여기서 객체화
			arr[i].width = (int) (Math.random() * 31) + 20;
			arr[i].height = (int) (Math.random() * 31) + 20;
			arr[i].sno = ++Rectangle2.cnt;
			arr[i].areaLen();
			System.out.println(arr[i]);
		}

		for (Rectangle2 r : arr)
			System.out.println(r);
	}

}
