package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone(); 추상클래스 객체 생성 불가
		// 실체 클래스의 공통되는 필드와 메소드를 추출해서 만들었기 때문에 생성 불가
		// 새로운 실체 클래스를 만들기 위해 부모 클래스로만 사용된다. 즉 extends 뒤에만 올 수 있는 클래스이다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동"); // 추상클래스를 상속받는 자식클래스를 객체로 생성
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
