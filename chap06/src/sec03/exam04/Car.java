package sec03.exam04;

public class Car {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car() {
		// 생성자 1번
	}
	
	Car(String model){ // 생성자 2번 (오버로딩)
		this(model, "은색", 250); // 4번생성자 호출
	}
	
	Car(String model, String color){ // 생성자 3번 (오버로딩)
		this(model, color, 250); // 4번 생성자 호출
	}
	
	Car(String model, String color, int maxSpeed){ // 생성자 4번 (오버로딩)
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed; // 공통 실행 코드
	}
}
