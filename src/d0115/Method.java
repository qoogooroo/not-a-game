package d0115;

public class Method {
	
	int test() {
		return 1;
	}
	
	String test1() {
		return null;
	}
	// 데이터 타입 분류 : 기본형, 참조형
	// 메소드 타입 분류 : 데이터 타입을 리턴하는것, 아무것도 리턴하지 않는것(void)
	
	public static void main(String[] args) {
		Method m = new Method();
		int i = m.test();
		String str = m.test1();
		System.out.println(i);
		System.out.println(str);
	}
}
