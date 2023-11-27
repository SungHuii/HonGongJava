package sec01.exam20;

public class StringTrimExample {

	public static void main(String[] args) {
		
		String tel1 = "     02";
		String tel2 = "123      ";
		String tel3 = "     1234    ";
		// trim() 메소드는 앞뒤의 공백만 제거하고 중간의 공백은 제거하지 않는다.
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}

}
