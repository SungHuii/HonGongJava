package sec02.verify.exam03;

public class MovieThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			if(this.isInterrupted()) { // thread가 Interrupt를 받았는지 체크
				break; // 받았다면 break;
			}
		}
	}
}
