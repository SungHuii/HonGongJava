package sec05.exam06;

public class Earth {
	
	// 상수 선언
	// 불변의 값. 그렇지만 final 필드와는 다르게 static이 있어야한다.
	// 객체마다 저장할 필요가 없는 '공용성'을 띠고 있고, 여러 가지 값으로 초기화될 수 없기 때문이다.
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	
}
