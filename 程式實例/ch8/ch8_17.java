public class ch8_17 {
	public static void main(String[] args) {
		int x = 10;										// main�����ܼ�
		System.out.println("main�����ܼ� x = " + x);
		{												// �ۭq�϶��_�I
			int x = 15;									// error!�]�����ƫŧi 
			int y = 20;									// �϶������ܼ�	
			System.out.println("�϶������ܼ� y = " + y);
		}												// �ۭq�϶����I
	}
}

