public class ch7_11 {
	public static void main(String[] args) {
		double[] score = {90, 95, 80, 79, 92};	// �w�q�ǥͦ��Z�}�C
		double total = 0;
		for ( double sc:score )					// foreach�j��
			total += sc;						// ���p���`��
		double average = total / score.length;	// �p�⥭��
		System.out.printf("average = %5.2f", average);			
	}
}

