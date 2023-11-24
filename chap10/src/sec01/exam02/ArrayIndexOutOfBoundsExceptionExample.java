package sec01.exam02;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		String data1 = args[0];
		String data2 = args[1];
		// args[x] 값에 실행 매개값을 주지 않았기 때문에 인덱스 사용 불가능
		System.out.println("args[0] : " + data1);
		System.out.println("args[1] : " + data2);
		// Run - Run Configurations - Arguments - Program arguments 입력란에
		// 매개값 2개 입력해주면 예외발생 안함
	}

}
