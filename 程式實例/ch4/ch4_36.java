public class ch4_36 {
	public static void main(String[] args) {
		int x;
		double y;
		float z;
		long a;
		short x1 = 10;
		byte x2 = 5;
		
		y = (x = 10) + 3.3;				// 	�Nx�নdouble
		System.out.println("y = " + y);
		z = x + 5.5F;					// 	�Nx�নfloat
		System.out.println("z = " + z);
		a = x + 10L;					// 	�Nx�নlong
		System.out.println("a = " + a);
		x = x1 + x2;					// 	�Nx1�Mx2�নint
		System.out.println("x = " + x);
	}
}

