package sec02.exam01;

public class CarExample { // 필드 다형성 테스트

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		// 필드값을 KumhoTire 구현 클래스로 교체.

		myCar.run();
	}

}
