class SmallMath {
	int add(int x, int y) {							// ��ƥ[�k
		int z = x + y;
		return z;									// ��¶Ǧ^��ƭ�
	}		
	int sub(int x, int y) {							// ��ƴ�k
		return x - y;								// �Ǧ^��ƹB�⦡
	}
}

public class ch8_11 {
	public static void main(String[] args) {
		SmallMath A = new SmallMath();
		System.out.println(A.add(10, 20));
		System.out.println(A.sub(10, 20));
	}
}

