package sec02.exam01;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
			// Class.forName() 메소드는 매개값으로 주어진 클래스가 존재하면 Class 객체를 리턴한다.
			// 하지만 존재하지 않는다면 ClassNotFoundException을 발생시킨다.
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

}
