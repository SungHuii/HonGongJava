package sec01.verify.exam08;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
//		if(obj instanceof Student) {
//			Student student = (Student) obj;
//			return (student.studentNum == studentNum)&&(student.name.equals(name));
//		} else {
//			return false;
//		}
		if(!(obj instanceof Student)) return false; // obj가 Student의 객체가 아니면 false 리턴
		Student student = (Student) obj;
		if(studentNum != student.studentNum) return false;
		// studentNum이 Student클래스에서 받은 Num과 달라도 false 리턴
		return true;
	}
}
