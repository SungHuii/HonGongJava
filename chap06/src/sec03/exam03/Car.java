package sec03.exam03;

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
		this.model = model;
		// 매개변수 model 값을 필드의 model 값에 저장시키는 생성자
	}
	
	Car(String model, String color){ // 생성자 3번 (오버로딩)
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){ // 생성자 4번 (오버로딩)
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
