package d0113;

public class Array1 {
	public static void main(String[] args) {
		int i=0;
		String[] strs = new String[i];
		System.out.println(strs.length);
		String[] strs2 = null;
		System.out.println(strs2.length); //error
	}
}
