package test.test1031;
/*
4. 다음과 같은 멤버 변수를 갖는 Student 클래스를 구현 하시오
   멤버 변수
          String name //학생이름
          int ban,no,kor,eng,math  //반,번호,국어점수,영어점수,수학점수
   멤버 메서드
          1. getTotal
             기능 : 국어,영어,수학 점수의 합 반환
              리턴타입 : int
           2. getAverage
              기능 : 총점(국어,영어,수학 점수의 합) 을 과목수로 나눈 평균 반환
              리턴타입 : float
 */

// toString() 메서드 : syso에 객체참조변수만 써도 toString()이 자동호출된다   
// String.format("%d반 %d번 %s,ban,no,name) : printf와 같은 방식으로 사용가능 형식화된 내용을 String 타입으로 반환함.
class Student {
	String name;
	int ban, no, kor, eng, math;

	public int getTotal() {

		return kor + eng + math;
	}

	public float getAverage() {
		return getTotal() / 3f; // getTotal()/3.0 이면 3.0이 double타입이기때문에 float타입으로 리턴할수없다
	}

	public String toString() {
//		return ban + "반 " + no + "번 " + name + " 국어: " + kor + ", 영어:" + eng + ", 수학:" + math + " 총점:" + getTotal()
//				+ ", 평균:" + getAverage();
		return String.format("%d반 %d번 %s => 국어:%d, 영어%d, 수학%d, 총점:%d, 평균%.2f", ban, no, name, kor, eng, math,
				getTotal(), getAverage());
		//  printf와 비슷한데 String타입으로 변환.
	}
}

public class test4toStringStringformat {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.ban = 1;
		s1.no = 1;
		s1.kor = 100;
		s1.eng = 80;
		s1.math = 85;
		System.out.println(s1.getTotal());
		System.out.println(s1.getAverage());

		// 홍길동 학생의 전체 정보 출력
		System.out.println(s1); // 1반 1번 홍길동 국어:100,영어:80,총점:265,평균:88.3336
	}

}
