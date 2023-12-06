package sec01.exam10;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
	// 문자열 출력하기
	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test10.txt");
		
		String str = "ABC";
		
		writer.write(str);	// 문자열 전체를 출력
		
		writer.flush();
		writer.close();
	}

}
