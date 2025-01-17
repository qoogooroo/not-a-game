package d0117;

public class Static2 {
	int age = 1;
	static	int height;	//static변수는 italic꼴로 eclipse가 표현해줌
	
	void test(int n) {
		System.out.println("test start");
		if (n==0) {
			return;
		}
		System.out.println("test end");
		//return; //값을 내놓거나, 메소드를 종료함
	}
	
	public static void main(String[] args) {
		height = 3;		//static변수는 로딩때 이미 메모리가 생성되어 있음. 로딩은 실행전에 이루어짐.
		System.out.println(height);
		Static2 s = new Static2();
		System.out.println(s.age);
		System.out.println(s.height);
		s.test(0);
	}
}
