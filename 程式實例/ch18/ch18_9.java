public class ch18_9 {
	public static void main(String[] args) {
		Double x = Double.valueOf(10);					// Double���O
		Float y = Float.valueOf("101");					// Float���O
		System.out.println(x);
		System.out.println(y);
		System.out.println(x.getClass());				// �C�X�Ǧ^��x���O
		System.out.println(y.getClass());				// �C�X�Ǧ^��y���O
	}
}

