package d0115;

import java.util.Random;
import java.util.Scanner;

public class Variable2 {
	int i;	//mem var 생성시 메모리를 생성해야한다.	//초기화 안했으므로 int의 기본형인 0으로 초기화됨.
	String str;								//초기화 안했으니 참조형의 기본형인 null로 초기화
	public static void main(String[] args) {

		String str = new String();
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		Variable2 v = new Variable2();			// new 메모리생성
		
		// 객체 : var, method로 표현 가능한것
		
		System.out.println(v.i);			//0
		System.out.println(v.str);			//null
	}
}
