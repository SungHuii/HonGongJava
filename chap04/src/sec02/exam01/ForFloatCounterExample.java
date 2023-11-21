package sec02.exam01;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
			// 0.1은 float 타입으로 정확하게 표현할 수 없기 때문에 루프카운터 변수 x에 더해지는 실제 값이 0.1보다 약간 크다.
			// 결국 루프는 9번만 실행된다. for문의 루프카운터 변수에는 float는 사용하지 않는다.
		}
	}

}
