package sec04.verify.exam03;

public class MemberService {
	// login()메소드와 logout() 메소드를 선언하려고 한다.
	// login() 메소드를 호출할 때는 매개값으로 id와 password를 제공하고
	// logout() 메소드는 id만 매개값으로 제공한다.
	
	// 1. login() 메소드는 매개값 id가 "hong", 매개값 password가 "12345"일 경우에만 true로 리턴하고 이외는 false
	// 2. logout() 메소드의 내용은 "로그아웃 되었습니다"가 출력되도록 하세요
	
	// boolean / login / id(String), password(String)
	// void		/ logout / id(String)
	
	boolean login (String id, String password) {
		
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
}
