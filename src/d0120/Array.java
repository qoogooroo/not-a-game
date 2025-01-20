package d0120;

public class Array {

	public static void main(String[] args) {
		String[] strs = new String[10];
		//1, 11, 21, 31...
		
		for(int i = 0; i < strs.length; i++) {
			strs[i] = i*10 + 1 + "";
		}
		
		for (int i = 0; i < strs.length; i++) {
			System.out.println(i + " : " + strs[i]);
		}
	}
}
