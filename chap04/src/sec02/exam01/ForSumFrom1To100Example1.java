package sec02.exam01;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i <= 100; i++) {
			sum += i;
		}

		System.out.println(sum);
		//System.out.println("1~" + (i-1) + " 합 : " + sum);
		// i는 for문 안에서만 사용되었기 때문에 for문 밖에서는 컴파일 에러가 발생한다.
	}

}
