package sec01.exam01;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		// 인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
//		A.B b = new A.B(); 정적 멤버 클래스가 아니기 때문에 객체 생성 불가
		b.field1 = 3;
		b.method1();
		
		// 정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}

}
