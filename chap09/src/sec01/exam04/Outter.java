package sec01.exam04;

public class Outter { // 로컬 클래스에서 사용 제한
	// 자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
//		 arg = 100;
//		 localVariable = 100;  // final 특성을 가진 변수들은 변경 불가
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	
	// 자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;
		// arg = 100;
		// localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
