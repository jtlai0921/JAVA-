public class ch7_12 {
	public static void main(String[] args) {
		int[] score = {90, 95, 80, 79, 92};		// �w�q�ǥͦ��Z�}�C
		int max, min;
		max = min = score[0];					// �ȩw�̤j�ȻP�̤p��
		for ( int sc:score ) {					// foreach�j��
			if ( sc > max ) 					// �p�G�ثe�����j��̤j��
				max = sc;						// �N�ثe�����]���̤j��
			if ( sc < min )						// �p�G�ثe�����p��̤p��
				min = sc;						// �N�ثe�����]���̤p��
		}
		System.out.println("Max = " + max);		// �C�L�̤j��
		System.out.println("Min = " + min);		// �C�L�̤p��	
	}
}

