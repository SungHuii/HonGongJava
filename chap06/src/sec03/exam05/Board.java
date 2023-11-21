package sec03.exam05;

public class Board {
	
	// this()를 이용해서 중복코드를 제거하기
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board(String title, String content){
//		this.title = title;
//		this.content = content;
//		this.writer = "로그인한 회원아이디";
//		this.date = "현재 컴퓨터 날짜";
//		this.hitcount = 0;
		
		this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
	}
	
	Board(String title, String content, String writer){
//		this.title = title;
//		this.content = content;
//		this.writer = writer;
//		this.date = "현재 컴퓨터 날짜";
//		this.hitcount = 0;
		
		this(title, content, writer, "현재 컴퓨터 날짜", 0);
	}
	
	Board(String title, String content, String writer, String date){
//		this.title = title;
//		this.content = content;
//		this.writer = writer;
//		this.date = date;
//		this.hitcount = 0;
		
		this(title, content, writer, date, 0);
	}
	
	Board(String title, String content, String writer, String date, int hitcount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
		
		// 생성자의 내용이 비슷할 때, 앞의 생성자에 this()를 사용해서 마지막 생성자를 호출하면 중복코드 최소화 가능.
	}
}
