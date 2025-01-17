package d0117;

public class Array {
	
	
	public static void main(String[] agrs) {
		int[] nums = new int[2];	//배열 특성상 방갯수를 변경할 수 없다.
		nums[0] = 3;
		nums[1] = 5;
		
		int[] tmps = nums;
		nums = new int[nums.length+1];
		//nums = tmps;	nums[2]{3,5}
		for(int i = 0; i < tmps.length; i++) {
			nums[i] = tmps[i];
		}
	}
}
