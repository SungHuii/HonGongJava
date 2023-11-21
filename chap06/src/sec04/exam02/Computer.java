package sec04.exam02;

public class Computer {
	int sum1(int[] values) { // 매개변수를 배열타입으로 선언하면 호출 전 배열을 생성해야한다.
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) { // 배열 생성하지 않고 값의 목록만 넘겨주는 방법.
		// ...를 매개변수로 사용하면 메소드 호출 시 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값으로 사용함.
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
