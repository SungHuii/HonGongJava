package sec05.exam03;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다");
	}
	
	public static void main(String[] args) {
		
		// speed = 60; 
		// 메인 메소드도 정적 메소드(static method)이기 때문에 인스턴스 필드와 인스턴스 메소드를 main()메소드에서
		// 바로 사용할 수 없다.
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}
