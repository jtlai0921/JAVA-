public class ch7_28 {
	public static void main(String[] args) {
		String[] str = {"�̰��ť��� : ", "�����ť��� : ", "�̧C�ť��� : "};
		int[][] degree = {
				{25, 27, 29, 28, 26, 30, 28},			// �̰��ū�
				{23, 25, 27, 26, 24, 28, 26},			// �����ū�
				{21, 23, 25, 24, 22, 26, 24}			// �̧C�ū�
		};
		double sum, average;							// �`�p�ūשM�����ū�				
		for (int i = 0; i < degree.length; i++) {
			sum = 0;									// �̪���`�p�ū�
			for (int de:degree[i])
				sum += de;								// �ū��`�M
			average = sum / degree[i].length;			// �ūץ���
			System.out.printf("%s %5.2f\n", str[i], average);
		}
	}
}

