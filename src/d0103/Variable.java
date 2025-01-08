package d0103;

public class Variable {
	public static void main(String[] args) {
		int[] nums = new int[5]; // 각 배열은 0으로 초기화됨

		nums[0] = 10;

		for (int i = 0; i < 5; i++) {
			nums[i] = i + 1;
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println();
			System.out.println("num[" + i + "]=" + nums[i]);
		}		

	}
}
