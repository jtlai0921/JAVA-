public class ch7_6 {
	public static void main(String[] args) {
		int x = 3;
		int[] z = new int[x];			// �H�ܼƫŧi�}�C�Ŷ�
		z[0] = z[1] = z[2] = 2;
		int sum = z[0] + z[1] + z[2];
		System.out.println("sum : " + sum);			
	}
}

