public class ch7_2 {
	public static void main(String[] args) {
		double average;				// キА放	
		double total = 0;			// 放羆㎝
		double[] degree;
		degree = new double[7];		// –ぱ放
		
		degree[0] = 25;
		degree[1] = 22;
		degree[2] = 24;
		degree[3] = 20;
		degree[4] = 26;
		degree[5] = 21;
		degree[6] = 21;
		for ( int i = 0; i < 7; i++ )
			total += degree[i];		// 璸衡放羆㎝
		average =  total / 7;	 	// 璸衡キА放
		System.out.printf("秅キА放 : %5.2f", average);			
	}
}

