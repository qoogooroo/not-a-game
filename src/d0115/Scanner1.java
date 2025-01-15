package d0115;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Choose a number in 1~9 : ");
		String numStr = s.nextLine();
		System.out.println("You choose number " + numStr);
		
		int num = Integer.parseInt(numStr);
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
		
		/*
		 * for (int i = 1; i <= 9; i++) { System.out.println(i + "단 시작~"); for (int j =
		 * 1; j <= 9; j++) { System.out.println(i + " X " + j + " = " + i*j); }
		 * System.out.println(); }
		 */
	}
}
