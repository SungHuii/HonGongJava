package sec01.exam02;

public class People {
	
	// 필드
	public String name;
	public String ssn;
	
	// 생성자
	// 기본 생성자가 없고 매개변수가 2개 있는 생성자만 존재함.
	// 이럴 땐 자식 클래스에서 부모클래스의 생성자를 명시적으로 호출해야함
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
