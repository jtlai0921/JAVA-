public class ch20_11 {
	public static void main(String[] args) {
		try {
			String str = "Ming-Chi";
			char c = str.charAt(3);
			System.out.println("c�r���O : " + c);
			c = str.charAt(10);						// ���`�o��
			System.out.println("c�r���O : " + c);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("�r��W�X����" + e);
		}
		System.out.println("ch20_11.java�{������");
	}
}

