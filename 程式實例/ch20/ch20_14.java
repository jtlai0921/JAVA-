public class ch20_14 {
	public static void main(String[] args) {
		try {								// �S�����`
			String str = "���Ӭ�ޤj��";
			char c = str.charAt(10);
			System.out.println("c�r���O : " + c);
		}
		catch(ArithmeticException e) {
			System.out.println("���Ƭ�0�����~" + e);
		}
		finally {
			System.out.println("�@�w�|����finally�϶�");
		}
		System.out.println("ch20_14.java�{������");
	}
}

