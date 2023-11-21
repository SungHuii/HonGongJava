package sec02.exam01;

public class BreakOutterExample {

	public static void main(String[] args) {
		
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;
					// break; 만 작성하면 A-g, b-a ... Z-g까지 나오고 Outter for문 종료
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
