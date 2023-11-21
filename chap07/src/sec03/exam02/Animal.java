package sec03.exam02;

public abstract class Animal { // 추상 클래스
	public String kind;
	
	public void breathe() { // 공통 메소드
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); // 추상 메소드
	// 동물마다 내는 소리가 다르므로 상속하는 하위클래스에서 다시 재정의할 수 있도록 추상 메소드로 선언

}
