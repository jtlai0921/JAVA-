public class ch8_16 {
	public static void main(String[] args) {
		int x = 10;										// main�����ܼ�
		System.out.println("main�����ܼ� x = " + x);
		{												// �ۭq�϶��_�I
			int y = 20;									// �϶������ܼ�	
			System.out.println("�϶������ܼ� y = " + y);
		}												// �ۭq�϶����I
		int y = 30;										// �϶��~���ܼ�
		System.out.println("�϶��~���ܼ� y = " + y);
	}
}

