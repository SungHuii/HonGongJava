package sec05.exam04;

public class Singleton {
	
	// 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야하는 경우
	// 단 하나만 생성된다 = 싱글톤 Singleton
	// 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 만들어야함 (생성자가 호출되면 호출된 만큼 객체 생성)
	// 생성자를 외부에서 호출할 수 없도록 하려면 private 접근 제한자를 붙여준다.
	// 그리고 자신의 타입인 정적 필드를 하나 선언하고 자신의 객체를 생성해 초기화한다.
	// (클래스 내부에서는 new 연산자로 생성자 호출이 가능함)
	// 정적 필드도 private 연산자를 붙여 외부에서 필드값을 변경하지 못하도록 막는다.
	// 대신 외부에서 호출할 수 있는 정적 메소드 getInstance를 선언하고 정적 필드에서 참조하고 있는 자신의 객체를 리턴한다
	
	
	// 정적 필드
	private static Singleton singleton = new Singleton();
	
	// 생성자
	private Singleton() {
		
	}
	
	// 정적 메소드
	static Singleton getInstance() {
		return singleton;
	}
}
