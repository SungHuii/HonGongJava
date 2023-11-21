package sec03.exam01;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue); // 유니코드 값인 '가'가 출력
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue); // 소수점 버려짐
		

	}

}
