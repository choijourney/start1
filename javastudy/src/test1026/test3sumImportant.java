package test1026;

/*
(1)+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+(1+2+3+4+5+6)+
 (1+2+3+4+5+6+7)+(1+2+3+4+5+6+7+8)+(1+2+3+4+5+6+7+8+9)+
(1+2+3+4+5+6+7+8+9+10)=220 한줄로 출력하기
*/
// 220 
public class test3sumImportant {

	public static void main(String[] args) {
		int sum = 0;
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			sum2 += sum;
			System.out.println(sum2);
		}

		// T방식
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				sum += j;
			}
		}
		System.out.println(sum);
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("(");
			for (int j = 1; j <= i; j++) {
				// (j == i) : 마지막출력
				System.out.print(j + ((j == i) ? "" : "+"));
				sum += j;
			}
			// i == 10 : i값의 마지막
			System.out.print(")" + ((i == 10) ? "=" : "+"));
		}
		System.out.println(sum);
	}

}
