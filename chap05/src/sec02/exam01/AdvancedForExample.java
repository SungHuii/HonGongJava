package sec02.exam01;

public class AdvancedForExample {

	public static void main(String[] args) {
		
		int[] scores = {95, 81, 84, 95, 75};
		
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		
		System.out.println("점수 평균 : " + avg);
		

	}

}
