package test1027;

/*
1부터 100까지 임의의 수 10개를  배열에 저장하고, 정렬하여 출력하기
  1. 배열 선언, 생성.
  2. 임의의 수를 10개 배열에 저장
  3. 정렬
  4. 출력
*/
public class test4$ {

	public static void main(String[] args) {
		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) { // 10번반복하면서 nums배열에 랜덤숫자 저장
			nums[i] = (int) (Math.random() * 100) + 1;
			for (int j = 0; j < i; j++) { // 아래에 i-- 를 썼기때문에 i반복횟수가 달라질수있어서 j<i 를 해야
				if (nums[i] == nums[j]) { // 정상적으로 i와 j를 비교할수있다
					i--; // nums[i] 와 nums[i-1]을 비교. //
				}
			}
		}

		// 정렬

		for (int i = 0; i < nums.length; i++) { // for문을 한번만쓰면 옆에있는 숫자들과 한번씩만 위치가바뀐다. 중첩을 써야 0~9까지 위치가바뀌어 정렬됨
			for (int j = 0; j < nums.length - 1; j++) { // nums.length-1을 해야 아래에서 j+1을 쓸수있음. 0~8 까지반복 여기서 8+1해서 인덱스 9를
														// 맞출수있음

				if (nums[j] > nums[j + 1]) {
					int tem = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = tem; // 큰숫자를 뒤로, 작은숫자를 앞으로 옮김
				}
			}
		}

		for (int result : nums) {
			System.out.print(result + " ");
		}

	}

}
