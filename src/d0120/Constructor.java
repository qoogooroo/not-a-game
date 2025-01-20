package d0120;

public class Constructor {
	//java는 특성상 메모리 최적화가 불가능 (가비지 컬렉터가 알아서함)
	//생성자는 대문자로 시작함, 데이터 타입 없음
	public Constructor() {
		System.out.println("new memory careated@");
	}// 여기는 안써줘도 컴파일러가 해줌
	public static void main(String[] agrs) {
		Constructor c = new Constructor();
		c = new Constructor();
	}
}
