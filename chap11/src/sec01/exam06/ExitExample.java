package sec01.exam06;

public class ExitExample {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 5; i++) {
			if(i == 5) {
				System.exit(0); // 프로그램을 강제종료하므로 하단의 프린트문은 출력되지 않음.
				// 하단의 프린트문을 출력하려면 exit보다는 break 문을 사용해야함.
//				 break;
			}
		}

		System.out.println("마무리 코드");
	}

}
