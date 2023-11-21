package sec02.exam01;

public class ForExam1 {

	public static void main(String[] args) {
		int i ;
		int sum = 0;
//		
//		for(i = 1; i <=100; i++) {
//			if(i%3 == 0) { // 나머지가 0이어야 3의 배수.
//
//				sum += i;
//			}
//		}
		
		for (i = 1; i <= 100; i++) {
			if(i%3 != 0) {
				continue;
			}
			sum += i;
		}

		System.out.println("1-100 의 정수 중 3의 배수의 총합은 : " + sum);
	}

}
