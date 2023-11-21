package sec02.exam01;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i]; // oldIntArray 배열 값 1,2,3을 새 배열에 복사
		}
		
		for(int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] +", "); // 1, 2, 3, 0, 0, 
													// 새 배열의 크기는 5칸인데 구 배열의 크기는 3칸이므로 남는 2칸은 초기값 0으로 나옴
		}

	}

}
