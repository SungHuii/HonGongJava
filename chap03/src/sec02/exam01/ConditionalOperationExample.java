package sec02.exam01;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
		
		System.out.println(score + "점은 " + grade + "입니다");

	}

}
