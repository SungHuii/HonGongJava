package sec01.exam11;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/test7.txt");
		
		while(true) {
			int data = reader.read();	// 한 문자씩 읽기
			if(data == -1) break;
			System.out.println((char)data); // (char)을 안붙이면 아스키코드로 출력
		}
		reader.close();
	}

}
