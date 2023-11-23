package sec02.exam02;

public class Anonymous { // 익명 구현 객체 생성
	// 필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};	// 필드 선언과 초기값 대입
	
	void method1() {
		// 로컬 변수값으로 대입
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		// 로컬 변수 사용
		localVar.turnOn();
	}
	
	void mmethod2(RemoteControl rc) {
		rc.turnOn();
	}
}
