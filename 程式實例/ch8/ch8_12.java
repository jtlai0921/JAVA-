public class ch8_12 {
	public static void main(String[] args) {
		int sum = 0;						// �`�M�ܼ�
		for ( int i = 1; i <= 10; i++ ) {	// �j�餺�ŧi�����ܼ�
			sum += i;						// �p��C�Ӱj�骺�`�M
			System.out.printf("Loop = %2d,  �`�M = %2d%n", i, sum);
		}
		System.out.println("i = " + i);		// ���~���~
	}
}

