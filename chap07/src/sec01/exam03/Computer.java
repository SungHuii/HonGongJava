package sec01.exam03;

public class Computer extends Calculator{

//	@Override
//	double areaCircle(double r) {
//		// TODO Auto-generated method stub
//		return super.areaCircle(r);
//	}
	@Override // 생략 가능하나 붙여주면 정확하게 재정의된 것인지 컴파일러가 확인함.
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r; // 재정의
	}
	
	
	
}
