public class ch7_4 {
	public static void main(String[] args) {
		double average;				// �s�񥭧��ū�	
		double total = 0;			// �s��ū��`�M
		double[] degree = new double[7];	// �C�ѷū�
		
		
		degree[0] = 25;
		degree[1] = 22;
		degree[2] = 24;
		degree[3] = 20;
		degree[4] = 26;
		degree[5] = 21;
		degree[6] = 21;
		for ( int i = 0; i < degree.length; i++ )
			total += degree[i];					// �p��ū��`�M
		average =  total / degree.length;	 	// �p�⥭���ū�
		System.out.printf("�@�g�����ū� : %5.2f", average);			
	}
}

