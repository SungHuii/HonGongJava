package sec01.verify.exam03;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Student) {
//			Student student = (Student) obj;
//			if(studentNum.equals(student.studentNum)) {
//			return true;
//			}
//		} 
//		return false;
//	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	// Object의 equals()와 hashCode()를 재정의해서 Student의 학번이 같으면 동등 객체가 될 수 있도록.
	// hashCode()의 리턴값은 studentNum 필드값의 해시코드를 리턴한다.
	
}
