public class ch7_13 {
	public static void main(String[] args) {
		int[] score = {90, 58, 80, 49, 92};					// �w�q�ǥͦ��Z�}�C
		int passingScore = 60;								// �̧C�зǤ���
		for ( int i = 0; i < score.length; i++ ) {					
			if ( score[i] < passingScore )					// �p�G�C��̧C�зǤ���
				System.out.printf("score[%d] = %d\n", i, score[i]);		// �C�L����
		}
	}
}

