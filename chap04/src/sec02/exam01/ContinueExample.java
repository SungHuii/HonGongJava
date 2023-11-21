package sec02.exam01;

public class ContinueExample {

	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++) {
			if(i%2 != 0) { // 2로 나눈 나머지가 0이 아닐 경우, 즉 홀수인 경우
				continue; // 아래 print문으로 가지 않고 다시 for문으로 돌아감.
			}
			System.out.println(i);
		}

	}

}
