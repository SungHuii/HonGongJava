package sec02.exam01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------------------");
		x++;
		++x;
		System.out.println("1x : " + x);
		
		System.out.println("-------------------------");
		y--;
		--y;
		System.out.println("1y : " + y);
		
		System.out.println("-------------------------");
		z = x++;
		System.out.println("1z : " + z);
		System.out.println("2x : " + x);
		
		System.out.println("-------------------------");
		z = ++x;
		System.out.println("2z : " + z);
		System.out.println("3x : " + x);
		
		System.out.println("-------------------------");
		z = ++x + y++;
		System.out.println("3z : " + z);
		System.out.println("4x : " + x);
		System.out.println("2y : " + y);
		
	}

}
