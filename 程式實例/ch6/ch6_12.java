public class ch6_12 {
	public static void main(String[] args) {
		int sum = 0;				// �`�M
		for ( int i = 1; i <= 10; i++ ) {
			if ( i % 2 == 0 )		// �p�G����0�h�O����
				continue;
			sum += i;				// �P�ثe�`�M�ۥ[
		}
		System.out.println("1-10�_���`�M�O : " + sum);		
	}
}

