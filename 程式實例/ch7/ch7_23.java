public class ch7_23 {
	public static void main(String[] args) {
		int[][] x = new int[2][];		// �ŧi�G���}�C���O���t�m�Ĥ@���Ŷ�		
		for (int i = 0; i < x.length; i++)
			x[i] = new int[3];			// �t�m�ĤG���Ŷ�		
		System.out.println("x �����ƶq = " + x.length);
		for (int i = 0; i < x.length; i++)
			System.out.printf("x[%d]�����ƶq = %d\n", i, x[i].length);
	}
}

