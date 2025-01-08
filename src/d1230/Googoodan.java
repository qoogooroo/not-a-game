package d1230;

public class Googoodan {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "단 시작~");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println();
		}

	}
}
