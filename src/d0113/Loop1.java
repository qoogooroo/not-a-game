package d0113;

public class Loop1 {
	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			if(i%2 == 1) {
				continue; //아래 반복문을 실행하지않고 증감부로 감
			}
			System.out.println(i);
		}

	}
}
