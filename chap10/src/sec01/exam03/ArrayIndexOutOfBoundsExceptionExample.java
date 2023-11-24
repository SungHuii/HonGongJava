package sec01.exam03;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		} else {
			System.out.println("두 개의 실행 매개값이 필요합니다.");
		} // else 문에 매개값이 없을 때의 실행문을 줬기 때문에 예외처리 발생하지 않음.

	}

}
