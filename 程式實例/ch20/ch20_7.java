public class ch20_7 {
	public static void main(String[] args) {
	int[] x = {5, 6, 7, 8, 9};
	int sum = 0;
		for ( int i = 0; i <= x.length; i++ ) { 	// �[�k�j��	
			try {
				sum += x[i];						// �[�k�`�p
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("���ޭ�i�W�X�d��" + e);
				break;				// �ѩ���޶W�X�d��ҥH�������X�j��
			}
			System.out.printf("���ޭ� : %d,  �[�`���G : %d\n", i, sum);	
		}
	}
}

