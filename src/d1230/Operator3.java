package d1230;

public class Operator3 {
	public static void main(String[] args) {
		/* asterisk
		 * 
		 * 사칙연산, 나머지, 증감연산자
		 * 
		 * 비교 연산자(boolean)
		 * ==, !=, >=, <=
		 * 논리 연산자
		 * ||, &&
		 */
		System.out.println(1==1);
		System.out.println(1!=1);
		System.out.println(1<1);
		System.out.println(1>1);
		System.out.println(1<=1);
		System.out.println(1>=1);
		
		System.out.println(1==1 && 2!=2); //and 연산시 하나라도 false가 나오면 뒤의 연산은 하지 않는다.
		System.out.println(1==1 || 2!=2); //or 연산시 하나라도 true가 나오면 뒤의 연산은 하지 않는다.
		
	}
}
