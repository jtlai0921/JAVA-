public class ch10_11 {
	public static void main(String[] args) {
		double rate = 0.06;				// �Q�v
		double capital = 100000;		// ����
		double capitalInfo;
		for ( int i = 1; i <= 20; i++ ) {
			capitalInfo = capital * Math.pow((1.0 + rate), i);
			System.out.printf("�� %2d �~�᥻���M�O %10.2f\n", i, capitalInfo);
		}
	}
}

