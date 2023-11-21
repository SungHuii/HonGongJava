package exercise;

public class Exercise05 {

	public static void main(String[] args) {
		
		// 중첩 for문을 이용해서 주어진 배열의 전체 항목의 합과 평균을 구해보세요
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		//작성 위치
		/*
		int length = 0;
		for(int i = 0; i < array.length; i++) {
			length += array[i].length;
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				avg = (double) sum / length;
			}
		}
		내가 쓴 답
		*/
		
		// 정답
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count ++;
			}
		}
		
		avg = (double) sum / count;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		/*
		 * 실행결과
		 * sum : 881
		 * avg : 88.1
		 * */

	}

}
