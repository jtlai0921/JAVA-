public class ch7_5 {
	public static void main(String[] args) {
		double average;				// �s�񥭧��ū�	
		double total = 0;			// �s��ū��`�M
		double[] degree = {25, 22, 24, 20, 26, 21, 21};
		
		for ( int i = 0; i < degree.length; i++ )
			total += degree[i];					// �p��ū��`�M
		average =  total / degree.length;	 	// �p�⥭���ū�
		System.out.printf("�@�g�����ū� : %5.2f", average);			
	}
}

