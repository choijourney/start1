package chap6class;
//Rectangle3.java 소스의 Rectangle3 클래스를 이용하여 구동클래스 구현하기

//가로,세로 길이가 20~50 사이인 임의의 길이를 가진 사각형 5개를 생성하고
//5개 사각형 각각의 넓이,둘레,정보 출력하기 
// 5개 사각형의 넓이의 합과, 둘레의 합을 출력

public class Exam4 {

	public static void main(String[] args) {
		Rectangle3[] r = new Rectangle3[5];
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < r.length; i++) {
			r[i] = new Rectangle3();
			r[i].width = (int) (Math.random() * 31) + 20;
			r[i].height = (int) (Math.random() * 31) + 20;
			r[i].sno = ++Rectangle3.cnt;

			System.out.println(r[i]);

			sum += r[i].area();
			sum2 += r[i].length();
		}
		System.out.println("전체 사각형의 넓이:" + sum);
		System.out.println("전체 사각형의 둘레:" + sum2);
	}

}
