public class ch7_24 {
	public static void main(String[] args) {
		int[][] x = new int[2][];		// �ŧi�G���}�C���O���t�m�Ĥ@���Ŷ�		
		x[0] = new int[3];				// �t�m3�Ӥ�������
		x[1] = new int[2];				// �t�m2�Ӥ�������
		System.out.println("x �����ƶq = " + x.length);
		for (int i = 0; i < x.length; i++)
			System.out.printf("x[%d]�����ƶq = %d\n", i, x[i].length);
		x[0][0] = 1;					// �����]�w�G���}�C������
		x[0][1] = 2;
		x[0][2] = 3;
		x[1][0] = 4;
		x[1][1] = 5;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++ ) 
			    System.out.printf("x[%d][%d] = %d\t", i, j, x[i][j]);
			System.out.println("");
		}
	}
}

