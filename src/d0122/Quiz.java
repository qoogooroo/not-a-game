package d0122;

public class Quiz {
	int a;
	static int b;	//eclipse에서 static값은 italic체로 표현해줌
	
	public static void main(String[] args) {
		//none-static
		Quiz q1 = new Quiz();
		System.out.println(q1.a);
		
		q1.a = 10;
		q1 = new Quiz();
		System.out.println(q1.a);
		
		//static
		Quiz q2 = new Quiz();
		System.out.println(q2.b);
		
		q2.b = 10;
		q2 = new Quiz();
		System.out.println(q2.b);
	}
	
}
