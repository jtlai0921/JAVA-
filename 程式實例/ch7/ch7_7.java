public class ch7_7 {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int[] z = new int[y-x];			// �H�B�⦡�ŧi�}�C�Ŷ�
		z[0] = z[1] = 2;
		int sum = z[0] + z[1];
		System.out.println("sum : " + sum);			
	}
}

