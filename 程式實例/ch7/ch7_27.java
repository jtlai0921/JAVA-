public class ch7_27 {
	public static void main(String[] args) {
		int[][] degree = {
				{25, 27, 29, 28, 26, 30, 28},			// �̰��ū�
				{23, 25, 27, 26, 24, 28, 26},			// �����ū�
				{21, 23, 25, 24, 22, 26, 24}			// �̧C�ū�
		};
		double sum, average;							// �`�p�ūשM�����ū�				
		String str = "";
		for (int i = 0; i < degree.length; i++) {
			sum = 0;									// �̪���`�p�ū�
			for (int de:degree[i])
				sum += de;								// �ū��`�M
			average = sum / degree[i].length;			// �ūץ���
			switch (i) {
				case 0:
					str = "�̰��ť��� : ";
					break;
				case 1:
					str = "�����ť��� : ";
					break;
				case 2:
					str = "�̧C�ť��� : ";
					break;
			}
			System.out.printf("%s %5.2f\n", str, average);
		}
	}
}

