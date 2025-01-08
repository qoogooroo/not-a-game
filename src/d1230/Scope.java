package d1230;

public class Scope {
	public static void main(String[] args) {
		int i = 1;
		//double i = 1.1; 변수는 어떤영역에서 선언되면 그 영역이 끝날때까지 같은 변수명으로 다시 선언할 수 없다.
		double i2 = (double)i;
	}//main method 영역
	
}
