package d1230;

public class DataType2 {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i == 10);
		// 연산자 +-*/%
		i = 11;
		int i2 = 20;
		System.out.println(i + i2);
		System.out.println(i - i2);
		System.out.println(i / i2);
		System.out.println(i * i2);
		System.out.println(i % i2);

		// 형변환 casting
		byte b = 127;
		short s = 128;
		s = b; //short가 byte보다 큰 데이터타입이므로 가능
		//b = s; //불가능
		b = (byte)s; //형변환으로 가능
		
		int num = 1000000000;
		long l = 100000000000000000L;	//자바에서 정수 기본형 = int
		float f = 1.1F;					//자바에서 실수 기본형 = double;
		double db = 1.2;
	}
}
