public class ch7_19 {
	public static void main(String[] args) {
		int[][] x;
		x = new int[2][3];
		
		System.out.println("x �����ƶq = " + x.length);
		for (int i =0; i < x.length; i++)
			System.out.printf("x[%d]�����ƶq = %d\n", i, x[i].length);
	}
}

