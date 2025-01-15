package d0115;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a number(1~9) : ");
		String numStr = s.nextLine();
		int num = Integer.parseInt(numStr);

		for (int i = 1; i <= 100; i++) {
			if (i % 10 == num || i / 10 == num) {
				System.out.print("ZZ");
			} else {
				System.out.print(i);
			}

			//정렬
			if ((i) % 10 != 0) {
				System.out.print(", ");
			} else {
				System.out.println();
			}
			if (i < 10 && i % 10 != num) {
				System.out.print(" ");
			}
		}
	}
}
