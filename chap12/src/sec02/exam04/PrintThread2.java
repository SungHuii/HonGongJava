package sec02.exam04;

public class PrintThread2 extends Thread{
	public void run() {
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				break;
			}
		}
		// while문 빠져나오는 부분
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}