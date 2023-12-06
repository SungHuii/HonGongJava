package sec01.exam05;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	// 배열 길이만큼 읽기
	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/Temp/test2.db");
		
		byte[] buffer = new byte[100]; // 길이 100인 배열 생성
		
		while(true) {
			int readByteNum = is.read(buffer);	// 배열 길이만큼 읽기
			if(readByteNum == -1) break;	// 파일 끝에 도달했을 경우
			for(int i = 0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
				// 읽은 바이트 수만큼 반복하면서 배열에 저장된 바이트를 출력
			}
		}
		
		is.close();
		
		/*
		 * 많은 양의 바이트를 읽을 때는 read(byte[] b) 메소드를 사용하는 것이 좋다.
		 * 입력 스트림으로부터 100개의 바이트가 들어오면 read() 메소드는 100번을 반복해서 읽어야 하지만,
		 * read(byte[] b) 메소드는 한 번 읽을 때 배열 길이만큼 읽기 때문에 읽는 횟수가 현저히 줄어든다.
		 * 
		 * */
	}

}
