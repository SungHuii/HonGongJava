package sec01.verify.exam08;

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		
		// -127~128 범위 값 안에서는 == 비교연산자로 비교 했을 때 true가 나오고
		// 범위값을 벗어난 값에서는 번지를 비교하기 때문에 false가 나온다

	}

}
