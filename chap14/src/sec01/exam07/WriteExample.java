package sec01.exam07;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
	// 한 문자씩 출력하기
	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test7.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);	// 한 문자씩 출력
		
		writer.flush();
		writer.close();

	}

}
