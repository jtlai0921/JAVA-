public class ch6_6 {
	public static void main(String[] args) {
		int i, j;							// i�O�~�h,j�O���h�j���ܼ�
		i = j = 1;
		while ( i <= 9 ) {		            // �~�h�j��
			while ( j <= 9 ) {				// ���h�j��
				System.out.printf("%d*%d=%2d  ", i, j, (i*j));
				j++;						// �����h�j���ܼƥ[1			
			}
			i++;							// ���~�h�j���ܼƥ[1
			j = 1;							// �_�줺�h�j���ܼƬ�1
			System.out.println("");			// �����X
		}
	}
}

