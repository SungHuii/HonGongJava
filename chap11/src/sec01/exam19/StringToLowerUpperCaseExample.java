package sec01.exam19;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2)); // 문자열만 비교
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2)); // 전부 lowercase로 변환 후 비교
		
		System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자를 무시하고 문자열만 비교

	}

}
