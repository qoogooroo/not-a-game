package d0120;

public class Array3 {
	
	public static void main(String[] args) {
		String[] strs = new String[100];
		// 1, 2, 짝, 4, 만세, 짝, 7, 8, 짝, 만세
		// 11, 12, 짝, 14, 만세, 짝... 30=짝만세,ZMS
		// ZZ, ZZ, ZZ, ZZ, ZM, 

		/*
		 * for (int i = 0; i < strs.length; i++) { if((i+1)%3 == 0) { strs[i] = "ZZ";
		 * }else if((i+1)%5 == 0) { strs[i] = "MS"; }else { strs[i] = (i+1) + ""; } }
		 * 
		 * for (int i = 0; i < strs.length; i++) { System.out.println(i + " : " +
		 * strs[i]); }
		 */
		/*
		 * for (int i = 1; i <= 100; i++) { if (i % 10 == 3 || i / 10 == 3) {
		 * System.out.print("ZZ"); } else { System.out.print(i); } if ((i) % 10 != 0) {
		 * System.out.print(", "); } else { System.out.println(); System.out.println();
		 * } if (i < 10 && i % 10 != 3) { System.out.print(" "); } }
		 */
		
		for(int i= 0; i<strs.length; i++) {
			strs[i] = i+1+"";
		}
		
		
		for(int i= 0; i<strs.length; i++) {
			if ((i) % 10 != 0) {
				System.out.print(", ");
			} else {
				System.out.println();
			}
			if(i<10 && i%10!=3) {
				System.out.print(strs[i]);
			}
		}

	}
}
