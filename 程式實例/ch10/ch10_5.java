public class ch10_5 {
	public static void main(String[] args) {
		int x1 = 30;							// �w�q3�Ӿ��int
		int x2 = 50;
		int x3 = 80;
		int maxV;
		maxV = Math.max(Math.max(x1, x2), x3);	// �D3�ӭȪ����j��
		System.out.println("3�ӼƭȪ����j�ȬO : " + maxV);
		double y1 = 5.5;						// �w�q2��������ׯB�I��double
		double y2 = 3.6;
		double minV;		
		minV = Math.min(y1, y2);				// �D2�ӭȪ����p��
		System.out.println("2�ӼƭȪ����p�ȬO : " + minV);
	}
}

