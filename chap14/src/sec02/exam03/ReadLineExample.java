package sec02.exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader(
				ReadLineExample.class.getResource("language.txt").getPath()
				// 문자 기반 입력 스트림 얻기
		);
		
		BufferedReader br = new BufferedReader(reader); // BufferedReader 보조 스트림 연결
		
		while(true) {
			String data = br.readLine();
			if(data == null) break;
			System.out.println(data);
		}
		
		br.close();
	}

}
