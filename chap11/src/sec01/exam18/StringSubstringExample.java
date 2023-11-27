package sec01.exam18;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6); // 0포함 ~ 6제외까지
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); // 인덱스 7부터 끝까지
		System.out.println(secondNum);

	}

}
