package d0113;

public class Duple {
	public static void main(String[] args) {
		/*
		 * int i = 10;
		 * 
		 * do { System.out.println(++i); } while(i<10);
		 * 
		 * while(i<10) { System.out.println(++i); }
		 */

		int[] nums = new int[] { 2, 3 }; // nums[0] = 2, nums[1] = 3;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				System.out.println("Found at nums[" + i + "]");
				break;
			}
		}

	}
}
