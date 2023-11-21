package sec05.exam05;

public class Person {

	final String nation = "Korea";
	final String ssn; // 주민등록번호는 이름과 같이 주어져야하기 때문에 초기값을 주지 않음
	// 대신 final로 선언해놓은 필드값은 생성자에서 무조건 받아야함 
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
