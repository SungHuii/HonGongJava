package sec03.exam02;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}

	// 추상 메소드를 재정의해주지 않으면 컴파일 에러가 발생한다.
	
	@Override
	public void sound() {
		System.out.println("멍멍"); // 비어있던 추상 메소드 재정의
	}
}
