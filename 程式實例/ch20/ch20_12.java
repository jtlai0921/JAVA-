public class ch20_12 {
	public static void main(String[] args) {
		try {								// �S�����`
			String str = "���Ӭ�ޤj��";
			char c = str.charAt(3);
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

