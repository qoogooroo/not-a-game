package d0122;

public class AccessModifier {
	// public, protected, default, private
	// 넓은 순서
	
	/*
	 * public
	 * 아예 다른 package 에서도 불로올 수 있음
	*/
	/*
	 * default
	 * 다르게 부르기도함
	 * 딱히 안적었다면 default로 설정됨
	 * 같은 package 안이라면 어디든 불러올 수 있음
	 */	
	/*
	 *  private
	 *  같은 class 안에서만 불러올 수 있음
	*/
	static void test() {
		System.out.println("AccessModifier test");
	}
	
	public static void main(String[] args) {
		System.out.println();
	}
}
