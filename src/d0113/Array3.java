package d0113;

import java.util.Random;

public class Array3 {
	public static void main(String[] args) {
		String[] strs = new String[3];
		Random r = new Random();

		for (int i = 0; i < strs.length; i++) {
			strs[i] = r.nextInt(5)+1+"";
		}

		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}
