package sec02.exam01;

public class ForExam2 {

	public static void main(String[] args) {
		// 중첩 for문을 이용해서 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력해보세요
		// 단, x와 y는 10 이하의 자연수입니다.
		
		int x;
		int y;
		
		
		
		for(x = 1; x<=10; x++) {
			for(y = 1; y<=10; y++) {
				int value = 60;
				if ((4*x + 5*y) == value) {
					System.out.println("("+x+", "+y+")");
					
					System.out.println(4*x + 5*y);
					
				}
			}
		}

	}

}
