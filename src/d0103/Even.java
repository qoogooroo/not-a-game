package d0103;

public class Even {
	public static void main(String[] args) {
		for(int i = 1 ; i <= 100 ; i++) {
			if(i%2==0) {
				System.out.print(i);
				if((i)%10!=0) {
					System.out.print(", ");
				}else {
					System.out.println();
					System.out.println();
				}
				if(i<10) {
					System.out.print(" ");
				}
			}
		}
	}
}
