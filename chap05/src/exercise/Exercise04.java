package exercise;

public class Exercise04 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		/*
		for(int i = 0; i<array.length; i++) {
			if(array[i] > max) {
				max = 0;
				max += array[i];
			}
		}
		*/
		// 내가 쓴 답
		
		// 정답
		for (int i = 0 ; i < array.length; i ++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("max : " + max);
		

	}

}
