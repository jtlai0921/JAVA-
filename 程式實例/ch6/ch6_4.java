public class ch6_4 {
	public static void main(String[] args) {
		int i, j;							// i�O�~�h,j�O���h�j���ܼ�
		for ( i = 1; i <= 9; i++ ) {		// �~�h�j��
			for ( j = 1; j <= 9; j++ )		// ���h�j��
				System.out.printf("%d*%d=%2d  ", i, j, (i*j));
			System.out.println("");			// �����X
		}
	}
}

