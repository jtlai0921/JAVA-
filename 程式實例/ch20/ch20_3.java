public class ch20_3 {
	public static void main(String[] args) {
	int[] x = {5, 6, 7, 8, 9};
	int sum = 0;
		for ( int i = 0; i <= x.length; i++ ) { 	// �[�k�j��		
			sum += x[i];							// �[�k�`�p
			System.out.printf("���ޭ� : %d,  �[�`���G : %d\n", i, sum);	
		}
	}
}

