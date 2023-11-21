package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		byte x = 10;
		byte y = 20;
		double result2 = myCalc.divide(x, y); // byte 타입으로 넣어도 int로 자동타입변환됨
		System.out.println("result2 : " + result2);
		
		myCalc.powerOff();

	}

}
