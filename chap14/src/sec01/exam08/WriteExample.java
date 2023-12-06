package sec01.exam08;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
	// 배열 전체를 출력하기
	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		
		char[] array = {'A', 'B', 'C'};
		
		writer.write(array);
		
		writer.flush();
		writer.close();
	}

}
