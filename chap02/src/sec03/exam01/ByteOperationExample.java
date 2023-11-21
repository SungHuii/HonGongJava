package sec03.exam01;

public class ByteOperationExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20;
		// 자바 컴파일러는 컴파일 단계에서 10 + 20 을 미리 연산해서 30을 만들고 result 변수에 30을 저장하도록
		// byte 코드를 생선한다. 이 경우에는 피연산자가 변수가 아닌 10, 20이므로 int 타입으로 변환하지 않는다.
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		// byte result3 = x + y; -> byte 변수인 x, y가 피연산자로 사용되면 int 타입으로 변환되어 연산되므로 연산 결과를 byte 변수에 저장하면 컴파일 에러가 발생한다.
		System.out.println(result2);
		
		// 정수 연산식에서 모든 변수가 int 타입으로 변환되는 것은 아니고, 두 피연산자 중 허용범위가 큰 타입으로 변환되어 연산을 수행한다

	}

}
