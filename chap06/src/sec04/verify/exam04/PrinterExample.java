package sec04.verify.exam04;

public class PrinterExample {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println1(10); // 정적 요소 클래스 이름으로 접근
		printer.println1(true); // 객체 참조 변수로 접근
		printer.println1(5.7);
		printer.println1("홍길동");
	}

}
