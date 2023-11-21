package sec02.exam01;

public class BreakExample {

	public static void main(String[] args) {
		while(true) { // 값이 true 일 때까지는 계속 반복실행
			int num = (int) (Math.random() * 6) + 1; // 주사위 랜덤값
			System.out.println(num);
			if(num == 6) {
				break; // while문 빠져나옴
				
			}
		} // while문 끝
		
		System.out.println("6이 나왔으므로 반복실행 종료");
	}

}
