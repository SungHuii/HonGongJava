package sec02.exam01;

public class ForExam3 {

	public static void main(String[] args) {
		// * 	for문으로 
		// **
		// ***
		// **** 만들기
		String star = "*";
		for (int i=1; i <=4; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}

		
		System.out.println();
		
		
		// for문으로 위 문제 반전되게 만들기
		//     *
		//    **
		//   ***
		//  ****
		for (int i = 1; i <= 4; i++) {
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		System.out.println();
		// for문으로 위 문제 반전되게 만들기 방법2
		//     *
		//    **
		//   ***
		//  ****
		for (int i = 1; i < 5; i++) {
			for(int j = 4; j > 0; j--) {
				if(i < j) {
					System.out.print(" ");
				} else {
					System.out.print(star);
				}
			}
			System.out.println();
		}
	}

}
