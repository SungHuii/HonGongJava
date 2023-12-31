package sec03.exam01;

public class LongOperationExample {

	public static void main(String[] args) {
		// 정수 연산식에서 모든 변수가 int 타입으로 변환되는 것은 아니고, 두 피연산자 중 허용범위가 큰 타입으로 변환되어 연산을 수행한다
		// int 타입보다 허용 범위가 더 큰 long 타입이 피연산자로 사용되면 다른 피연산자는 무조건 long타입으로 변환하고 연산을 수행한다.
		// 따라서 연산 결과를 long 타입 변수에 저장해야한다.
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.println(result);
		
	}

}
