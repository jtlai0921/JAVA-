public class ch7_15 {
	public static void main(String[] args) {
		int[] score = {90, 58, 80, 49, 92};					// �w�q�ǥͦ��Z�}�C
		int tmp;											// �Ȯ��x�s����
		for ( int i = 0; i < (score.length - 1); i++ )  {
			for ( int j = 0; j < (score.length - i - 1); j++ ) {
				if ( score[j] < score[j+1] ) {		// �o�ͫe��������᭱�����p
					tmp = score[j];
					score[j] = score[j+1];			// ���j�������ȩ�e��
					score[j+1] = tmp;				// ���p�������ȩ�᭱
				}
			}
			System.out.printf("�C�X�� %d ���j��Ƨǵ��G\n", (i+1));
			for ( int sc:score )
				System.out.printf("%d ", sc);				// �C�L�ثe�ƧǪ��p
			System.out.println("");	
		}
	}
}

