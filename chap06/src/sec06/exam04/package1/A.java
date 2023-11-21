package sec06.exam04.package1;

public class A {
	// 필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	// 생성자
	// A 클래스 내부에서는 A의 모든 생성자를 호출할 수 있다
	public A(boolean b) {
		// public 접근제한
	}
	
	A(int b){
		// default 접근제한
	}
	
	private A(String b) {
		// private 접근제한
	}
	

}
