package sec04.exam03;

public class Car {

	//필드
	int gas;
	
	// 생성자
	
	// 메소드
	void setGas(int gas) {
		this.gas = gas;
		// 리턴값이 없는 메소드로, 매개값을 받아서 gas 필드값을 변경
	}
	
	
	// 리턴값이 boolean인 메소드로 gas 필드값이 0이면 false, 0이 아니면 true 리턴
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 " + gas +"만큼 있습니다.");
		return true;
	} 
	
	// 리턴값이 없는 메소드로 gas 필드값이 0이면 return문으로 메소드 강제 종료
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas잔량 : " + gas + ")");
				return; // 메소드 실행 종료
			}
		}
	}
}
