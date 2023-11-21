package sec03.exam05;

public class BoardExample {

	public static void main(String[] args) {
			Board board1 = new Board("보드1", "내용1");
			Board board2 = new Board("보드2", "내용2", "작가2");
			Board board3 = new Board("보드3", "내용3", "작가3", "날짜3");
			Board board4 = new Board("보드4", "내용4", "작가4", "날짜4", 4);
			
			System.out.println(board1.title + board1.content);
	}

}
