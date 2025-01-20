package d0120;

public class Array5 {

	public static void main(String[] args) {
		int[] nums = new int[6];
		//1~45 난수 6개 생성 
		
		for(int i = 0; i < nums.length; i++) {
			int rNum = (int)(Math.random()*45);
			nums[i] = rNum +1;
		}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
