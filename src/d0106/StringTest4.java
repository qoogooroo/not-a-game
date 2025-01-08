package d0106;

public class StringTest4 {
	public static void main(String[] args) {
		String str1 = "abcdefghijklnmopqrstuxyz"; //String은 char의 배열
		System.out.println(str1.length());
		System.out.println(str1.substring(0,1)); // 0부터 1되기 전까지
		System.out.println(str1.substring(0,4)); // 0부터 4되기 전까지
		System.out.println(str1.substring(4,7)); // efg
		System.out.println(str1.substring(20));	 // 20번째부터 끝까지	
	}
}
