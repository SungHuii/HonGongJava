package sec01.exam06;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);	// "홍길동" 키가 같기 때문에 제일 마지막에 저장한 값으로 대체됨
		System.out.println("총 Entry 수 : " + map.size()); // 저장된 총 Entry 수 얻기
		
		// 객체 찾기
		
		
	}

}
