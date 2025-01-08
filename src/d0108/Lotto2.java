package d0108;

import java.util.Random;

public class Lotto2 {
	public static void main(String[] args) {
		// 7개 맞추기, 난수는 1~50;
		Random r = new Random();
		int[] nums = new int[7];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(50) + 1;
			for (int j = 0; j < i; j++) {		//중복된 수 발견시 난수 재생성
				if(nums[i] == nums[j]) {
					System.out.println("Duplication! at #" + i);
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);

		}
	}
}
