package sec01.exam07;

public class Calculator { // 공유 객체
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) { // 계산기 메모리에 값을 저장하는 메소드
		this.memory = memory; // 매개값을 memory 필드에 저장
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {} // 스레드를 2초간 일시정지 시킴
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		// 스레드 이름을 얻어서 메모리값을 출력
	}
}
