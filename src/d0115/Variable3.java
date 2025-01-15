package d0115;

public class Variable3 {
	int i = 10;
	
	public static void main(String[] args) {
		Variable3 v = new Variable3();
		System.out.println(v.i);
		
		v.i = 99;
		
		Variable3 v2 = new Variable3();
		System.out.println(v2.i);		//v와 v2는 별도의 메모리를 차지하고 있으므로 v2.i의 값은 변하지 않음
		
		
	}
}
