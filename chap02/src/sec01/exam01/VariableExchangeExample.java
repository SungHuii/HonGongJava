package sec01.exam01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + " y: " + y);
		
		int temp = x; // temp에 x 값 대입 temp -> 3
		x = y; // x에 y값 대입 x -> 5
		y = temp; // y에 temp 값 대입 y -> 3
		System.out.println("x:" + x + " y: " + y);

	}

}
