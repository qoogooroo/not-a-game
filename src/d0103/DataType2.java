package d0103;

public class DataType2 {
	public static void main(String[] args) {
		int i = 1;
		byte b = (byte)i; // down casting
		long l = i; //up casting  l = (long)i로 써도 상관없음
		
		String str1 = 1 + ""; // 숫자 to 문자열
		
		i = Integer.parseInt(str1); //문자열 to 숫자
	}
}
