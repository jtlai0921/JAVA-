class SmallMath {
	int add(int x, int...y) {						// �i�ܰѼƪ�����
		int total = x;
		for ( int num:y )
			total += num;
		return total;								// ��¶Ǧ^��ƭ�
	}		
}
public class ch8_11_1 {
	public static void main(String[] args) {
		SmallMath A = new SmallMath();				// �w�q���OSmallMath������A
		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(A.add(1, 3));			// �p��1 + 3
		System.out.println(A.add(1, 3, 5));			// �p��1 + 3 + 5
		System.out.println(A.add(5, values));		// �p��5 + values�}�C	
	}
}

