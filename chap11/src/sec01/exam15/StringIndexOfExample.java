package sec01.exam15;

public class StringIndexOfExample {

	public static void main(String[] args) {

		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); // '프로그래밍'문자열이 시작되는 위치 인덱스를 찾음
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) { // indexOf는 주어진 문자열이 포함되지 않았을 때 -1을 리턴한다. 
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련없는 책이군요.");
		}

	}

}
