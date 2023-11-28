package sec01.exam04;

public class BeepPrintExample4 {

	public static void main(String[] args) {
		Thread thread = new BeepThread(); // 상속받은 스레드 클래스를 객체로 씀
		thread.start();
		
		for(int i = 0; i < 5 ; i ++) {
			System.out.println("띵");
			try {Thread.sleep(500);}
			catch (Exception e) {}
		}
	}

}
