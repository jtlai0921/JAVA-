public class ch6_7 {
	public static void main(String[] args) {
		int sum = 0;						// �`�M�ܼ�
		int i = 1;							// while�j�骺�ܼ�
		do {
			sum += i;						// �p��C�Ӱj�骺�`�M
			System.out.printf("Loop = %2d,  �`�M = %2d%n", i, sum);
			i++;							// ���j���ܼƥ[1
		} while ( i <= 10 );
	}
}

