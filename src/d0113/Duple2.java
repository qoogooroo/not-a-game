package d0113;

import java.util.Random;

public class Duple2 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] nums = new int[5];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(6) + 1;
			for (int j = 0; j < i; j++) { // 중복된 수 발견시 난수 재생성
				if (nums[i] == nums[j]) {
					System.out.println("Duplication! at #" + i);
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println("nums[" + i + "] = " + nums[i]);
		}
	}
}
