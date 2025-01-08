package d0106;

public class StringTest5 {
	public static void main(String[] args) {
		String str1 = "Hello~@";

		for (int i = 0; i < str1.length(); i++) {
				if(str1.substring(i,i+1).equals("l")) {
					System.out.println("index "+ i + "에서 'l'을(를) 찾았습니다.");
				}
		}
		
		System.out.println(str1.indexOf("l"));
		System.out.println(str1.lastIndexOf("l"));
	}
}