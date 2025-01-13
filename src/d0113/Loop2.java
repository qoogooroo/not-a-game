package d0113;

public class Loop2 {
	public static void main(String[] args) {
	
		
		for(int i = 1; i<10; i++) {
			for(int j = 1; j < 10 ; j++) {
				System.out.print(i + " X " + j + " = " + (i*j));
				if (j==9) {
					System.out.println();
					break;
				}
				System.out.print(", ");
			}
		}
		

	}
}
