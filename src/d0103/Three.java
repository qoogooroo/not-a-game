package d0103;

public class Three {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 3 || i / 10 == 3) {
				System.out.print("ZZ");
			} else {
				System.out.print(i);
			}
			if ((i) % 10 != 0) {
				System.out.print(", ");
			} else {
				System.out.println();
				System.out.println();
			}
			if(i<10 && i%10!=3) {
				System.out.print(" ");
			}
		}
	}
}
