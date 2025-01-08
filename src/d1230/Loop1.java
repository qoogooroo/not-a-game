package d1230;

public class Loop1 {
	public static void main(String[] args) {
		int i = 0;
		for (; i < 10; i++) {
			System.out.println("I'm Loop~");
		}
		System.out.println(i);
	} // 시작과끝이 명확할떄 for문, 명확하지 않다면 while문
		/*
		 * 선언부 반복문 초기에만 한번 실행 
		 * 조건부 반복문 한 루프가 시작될 수 있는지 매번 실행
		 * 증감부 반복문 한 루프가 끝나고 나서 실행
		 */
}
