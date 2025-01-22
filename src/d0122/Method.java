package d0122;

public class Method {
	int i;
	String str;

	/*
	 * void or DataType
	 * method는 매개변수까지가 이름처럼 취급된다.
	 */
	void test() {
		
	}
	int test(int i) {			//매개변수가 다름
		return 0;
	}
	int test(int i, String s) {	//매개변수 갯수가 다름
		return 0;
	}
	int test(String s, int i) {	//매개변수 순서가 다름
		return 0;
	}
	int number() {
		return 0;
	}
	public static void main(String[] args) {
		
	}
}
