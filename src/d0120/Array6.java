package d0120;

public class Array6 {
	
	public static void main(String[] args) {
		int[] nums = new int[6];
		//1~45 난수 //짝수일때는 0으로 만들기
		
		for(int i = 0; i < nums.length; i++) {
			int rNum = (int)(Math.random()*45) + 1;
			if (rNum % 2 == 1) {
				nums[i] = rNum;
			}

		}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
