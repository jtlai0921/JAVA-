class Math {
	void addition(long x, int y) {		    // long+int�Ʀr�[�k
		System.out.println("int�[�k : " + (x + y));
	}
	void addition(int x, long y) {			// int+long�Ʀr�[�k
		System.out.println("long�[�k : " + (x + y));
	}
}
public class ch9_8_5 {
	public static void main(String[] args) {
		Math A = new Math();				// Math���O����
		A.addition(5, 10);					// ����ambiguous
	}
}

