package d0117;

public class Static1 {
	
	int n1, n2;
	
	void test() {
		System.out.println("I'm test message.");
	}
	
	public static void main(String[] args) {
		Static1 s = new Static1();
		s.n1 = 1;
		s.test();
	}
}
