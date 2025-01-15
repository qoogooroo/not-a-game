package d0115;

public class Static {
	static int i;		//메모리를 생성하지 않아도 변수 호출 가능
	
	int test() {		//none-static
		return -1;
	}
	
	static int test1() {		//static
		return -2;
	}
	
	public static void main(String[] args) {
		System.out.println(i);
		test1();		//static
	}
}
