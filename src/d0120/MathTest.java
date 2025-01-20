package d0120;

import java.util.Random;

public class MathTest {
	public static void main(String[] args) {
		//Math m = new Math();
		double db = Math.random();//0.0~0.999999 란듐
		int i = (int)(db * 10) + 1;
		System.out.println(db);
		System.out.println(i);	
	}
}
