public class ch20_19 {
	public static void myMethod(int x1, int x2) throws ArithmeticException {
		System.out.println("�Ʀr���k���G�O : " + (x1 / x2));
	}
	public static void main(String[] args) {
		int[][] x = {{10, 2}, {10, 0}, {10, 5}};	// �G���}�C�x�s���
		for ( int i = 0; i < x.length; i++ ) {		// �j��B�z���ո��
			try {
				myMethod(x[i][0], x[i][1]);			// �I�s��k�B�z���ո��
			}
			catch(ArithmeticException e) {			// �������`
				System.out.println("���Ƭ�0�����`" + e);
			}
		}
	}
}

