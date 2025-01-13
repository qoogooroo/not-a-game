package d0113;

import java.util.Random;
import java.util.Scanner;

public class Input2 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);

		int targetNum = r.nextInt(100) + 1;
		
		while(true) {
			System.out.print("Enter your number(1~100) : ");
			String numStr = s.nextLine();
			int num = Integer.parseInt(numStr);
			System.out.print("Your input : " + num + "... So, ");
			if(num == targetNum) {
				System.out.println("YOU WIN!!");
				break;
			} else if(num < targetNum) {
				System.out.println("UP!");		
			} else {
				System.out.println("DOWN!");		
			}
			
		}
		
	}
}
