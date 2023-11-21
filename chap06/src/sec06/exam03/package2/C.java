package sec06.exam03.package2; // package1 과 패키지가 다름

import sec06.exam03.package1.*;

public class C {
//	A a;	// (X) A 클래스 접근 불가. A클래스는 default 이므로 접근할 수 없다.
	B b;	// (O) B 클래스 접근 가능. B클래스는 public 이므로 접근 가능하다.
}
