package sec01.exam22;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// 박싱
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		// valueOf(int)를 쓰는게 생성자로 쓸때 보다 성능 및 메모리 할당에서 성능상 유리하기 때문이다.
		Integer obj3 = Integer.valueOf("300");
		
		// 언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		

	}

}
