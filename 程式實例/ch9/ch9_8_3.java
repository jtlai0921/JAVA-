class Math {
	void addition(long x, int y) {		    	// 2�ӼƦr�[�k
		System.out.println((x + y));
	}
	void addition(int x, int y, int z) {		// 3�ӼƦr�[�k
		System.out.println((x + y + z));
	}
}
public class ch9_8_3 {
	public static void main(String[] args) {
		Math A = new Math();					// Math���O����
		A.addition(5, 10);						// ��1��int�ɯŬ�long
		A.addition(5, 10, 15);
	}
}

