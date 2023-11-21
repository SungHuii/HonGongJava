package sec04.exam01;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			if(inputData.equals("q")) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("입력된 문자열: \"" + inputData + "\"");
			}
		}
	}

}
