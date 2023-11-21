package sec02.exam01;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if ((charCode >= 65 ) & (charCode <=90)) {
			System.out.println("대문자입니다");
		}
		
		if ((charCode >=97) && (charCode <=122)) {
			System.out.println("소문자입니다");
		}
		
		if ( !(charCode<48) && !(charCode>57)) {
			System.out.println("0~9 숫자입니다");
		}
		
		int v = 6;
		if( (v%2==0) | (v%3==0)) {
			System.out.println("2 또는 3의 배수입니다");
		}
		
		if( (v%2==0) || (v%3==0)) {
			System.out.println("2 또는 3의 배수입니다");
		}

	}

}
