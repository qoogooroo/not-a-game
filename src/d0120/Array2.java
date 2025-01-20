package d0120;

public class Array2 {
	
	public static void main(String[] args) {
		String[] strs = new String[10];
		// 5의 배수 5, 10, 15, 20...

		for (int i = 0; i < strs.length; i++) {
			strs[i] = (i+1)*5 + "";
		}
		
		for (int i = 0; i < strs.length; i++) {
			System.out.println(i + " : " + strs[i]);
		}
	}
}
