package sec02.exam01;

import java.util.Scanner;

public class WhileExam2 {

	public static void main(String[] args) {

		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택 > ");
			
			int menuNum = Integer.parseInt(scanner.nextLine());
			
			switch(menuNum) {
			case 1:
				System.out.print("예금액 > ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
				
			case 2:
				System.out.print("출금액 > ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
				
			case 3:
				System.out.print("잔고 > ");
				System.out.println(balance);
				break;
			
			case 4:
				run = false;
				break;
				
			}
			
			System.out.println();
			
			
			
			
//			String select = scanner.nextLine();
//			scanner.nextLine();
//			
//			OUT : if(select.equals("1")) {
//				System.out.print("예금액 > " );
//				int select2 = scanner.nextInt();
//				
//				balance += select2;
//				break OUT;
//			}
//			
//			OUT : if(select.equals("2")) {
//				System.out.print("출금액 > ");
//				int select2 = scanner.nextInt();
//				if(balance > select2) {
//				balance -= select2;
//				} else {
//					System.out.println("출금액이 모자랍니다.");
//					break OUT;
//				}
//			}
//			
//			OUT : if(select.equals("3")) {
//				System.out.println("잔고 > " + balance);
//				break OUT;
//			}
//			
//			if(select.equals("4")) {
//				System.out.println("프로그램 종료");
//				break;
//			}
			
			
		}
		
		System.out.println("프로그램 종료");

	}

}
