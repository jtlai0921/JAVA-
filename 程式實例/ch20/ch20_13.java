public class ch20_13 {
	public static void main(String[] args) {
		try {								
			String str = "���Ӭ�ޤj��";
			char c = str.charAt(10);		// ���`�o��
			System.out.println("c�r���O : " + c);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("�r��W�X����" + e);
		}
		finally {
			System.out.println("�@�w�|����finally�϶�");
		}
	}
}

