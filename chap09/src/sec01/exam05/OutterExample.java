package sec01.exam05;

public class OutterExample { //실행 클래스

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();

	}

}
