public class ch7_22 {
	public static void main(String[] args) {
		int[][] x = new int[2][3];  	// �w�q�G���}�C�P�ɫŧi�t�m
		
		x[0][0] = 1;					// �����]�w�G���}�C������
		x[0][1] = 2;
		x[0][2] = 3;
		x[1][0] = 4;
		x[1][1] = 5;
		x[1][2] = 6;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++ ) 
			    System.out.printf("x[%d][%d] = %d\t", i, j, x[i][j]);
			System.out.println("");
		}
	}
}

