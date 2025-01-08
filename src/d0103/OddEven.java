package d0103;

public class OddEven {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i);
			if(i%10!=0) {
				System.out.print(", ");
			}else {
				System.out.println();
				System.out.println();
			} //","출력 및 줄바꿈
			if(i<10) {
				System.out.print(" ");
			} //10미만 숫자 정렬+
		}
	}
}
