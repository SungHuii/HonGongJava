package sec01.exam17;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		// String 객체의 문자열은 변경 불가능한 특성을 가지고 있기 때문에, 
		// replace() 메소드가 리턴하는 문자열은 완전히 새로운 문자열이다.
		// 그러므로 새로운 String 변수에 값을 저장해주어야 한다.
		System.out.println(oldStr);
		System.out.println(newStr);

	}

}
