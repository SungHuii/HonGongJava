package sec01.exam03;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B { // 인스턴스 멤버 클래스
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();	// 모든 필드와 메소드에 접근 가능
		}
	}
	
	static class C { // 정적 멤버 클래스
		void method() {
//			field1 = 10;  인스턴스 필드와 메소드는 접근 불가능
//			method1();  
			
			field2 = 10;
			method2();
		}
	}
}
