package sec02.exam03;

public class Button { // UI 클래스
	// 윈도우 및 안드로이드 등의 UI 프로그램에서 버튼의 클릭 이벤트를  처리하기 위해
	// 익명 구현 객체를 이용하는 방법
	OnClickListener listener; // 인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener) { // 매개 변수의 다형성
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick(); // 구현 객체의 onClick() 메소드 호출
	}
	
	static interface OnClickListener{
		void onClick();
	}

}
