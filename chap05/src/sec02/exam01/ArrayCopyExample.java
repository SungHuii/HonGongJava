package sec02.exam01;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// oldStrArray를, 0(첫번쨰)부터, newStrArray 배열에, 0(첫번째)부터, oldStrArray의 길이만큼만 복사

		for(int i = 0; i <newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
			// 나머지 2칸은 초기값 null로 표기
		}
	}

}
