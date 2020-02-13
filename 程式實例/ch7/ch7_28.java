public class ch7_28 {
	public static void main(String[] args) {
		String[] str = {"程蔼放キА : ", "キА放キА : ", "程放キА : "};
		int[][] degree = {
				{25, 27, 29, 28, 26, 30, 28},			// 程蔼放
				{23, 25, 27, 26, 24, 28, 26},			// キА放
				{21, 23, 25, 24, 22, 26, 24}			// 程放
		};
		double sum, average;							// 羆璸放㎝キА放				
		for (int i = 0; i < degree.length; i++) {
			sum = 0;									// 程て羆璸放
			for (int de:degree[i])
				sum += de;								// 放羆㎝
			average = sum / degree[i].length;			// 放キА
			System.out.printf("%s %5.2f\n", str[i], average);
		}
	}
}

