package d0113;

public class Array2 {
	public static void main(String[] args) {
		String str = 1 + "";
		
		String[] strs = new String[3]; //값을 입력하지 않는다면 각각 null로 초기화됨. 참조형의 기본값 = null
		
		System.out.println(strs[0]==null);
	}
}
