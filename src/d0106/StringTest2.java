package d0106;

public class StringTest2 {
	public static void main(String[] args) {
		String str1 = "hi";
		String str2 = "hi";
		System.out.println(str1 == str2);
		String str3 = new String("hi");
		String str4 = new String("hi");
		System.out.println(str3 == str4);	// == 값이 아닌 주소를 비교함
		System.out.println(str3.equals(str4));		
	}
}
