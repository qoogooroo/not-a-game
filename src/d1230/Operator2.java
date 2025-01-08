package d1230;

public class Operator2 {
	public static void main(String[] args) {
		int num = 1;
		num += 1;
		num++; //증감연산자(후순위연산)
		++num; //증감연산자(전위연산)
		System.out.println(num);
		
		num--;
		--num;
		num -= 1;
		System.out.println(num);	//num-- 1출력 , --num 0출력
	}
}
