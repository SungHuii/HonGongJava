package sec03.exam02;

public class Korean {
	// 필드
	String nation = "대한민국";
	String name;
	String ssn; //주민등록번호
	
	// 생성자
	public Korean(String name, String ssn) {
//		name = n;
//		ssn = s;
		this.name = name; // this.필드 = 매개변수;
		this.ssn = ssn;	  // 앞의 ssn은 필드의 ssn, 뒤의 ssn은 매개변수 ssn
	}
	
}
