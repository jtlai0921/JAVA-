public class ch6_5 {
	public static void main(String[] args) {
		int sum = 0;						// �`�M�ܼ�
		int i = 1;							// while�j�骺�ܼ�
		while ( i <= 10 ) {
			sum += i;						// �p��C�Ӱj�骺�`�M
			System.out.printf("Loop = %2d,  �`�M = %2d%n", i, sum);
			i++;							// ���j���ܼƥ[1
		}
	}
}

