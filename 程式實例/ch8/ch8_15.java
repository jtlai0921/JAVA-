public class ch8_15 {
	public static void main(String[] args) {
		int x = 10;										// main�����ܼ�
		System.out.println("main�����ܼ� x = " + x);
		{												// �ۭq�϶��_�I
			int y = 20;									// �϶������ܼ�	
			System.out.println("main�ŧi���ܼ� x = " + x);
			System.out.println("�϶������ܼ� y = " + y);
		}												// �ۭq�϶����I
	}
}

