class Math {
	void addition(int x, int y) {		    // 2��int�Ʀr�[�k
		System.out.println("int�[�k : " + (x + y));
	}
	void addition(long x, long y) {			// 2��long�Ʀr�[�k
		System.out.println("long�[�k : " + (x + y));
	}
}
public class ch9_8_4 {
	public static void main(String[] args) {
		Math A = new Math();				// Math���O����
		A.addition(5, 10);					// ���ɯŬ�long
	}
}

