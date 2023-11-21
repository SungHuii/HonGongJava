package sec01.exam02;

public class Student extends People{
	// 자식 클래스
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모 생성자 명시적 호출
		// 만약 부모 생성자가 기본 생성자이면 명시하지 않아도 호출됨.
		this.studentNo = studentNo;
	}

}
