package sec02.exam01;

public class Car { // 필드 다형성
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	// 인터페이스타입인 Tire로 필드값을 선언하고 초기 구현객체(한국타이어)를 대입
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll(); // 인터페이스에서 설명된 roll() 메소드 호출
		// Tire 인터페이스의 비어있는 roll() 메소드를 HankookTire 클래스와 KumhoTire 클래스에서
		// roll()메소드를 구현하고, Car 클래스에서 인터페이스로 필드값을 선언하고 구현 클래스를 객체로 받으면,
		// 구현된 roll() 메소드를 사용할 수 있다.
	}
}
