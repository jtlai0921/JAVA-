public class ch12_21 {
	public static void main(String[] args) {
		String str1 = "���Ӭ�ޤj��";
		String str2 = "���Ӭ�ޤj��";
		String str3 = new String("���Ӭ�ޤj��");				// �ƥ�		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str1 = str2 " + str1.equals(str2));	// �r�ꤺ�e���
		System.out.println("str1 = str3 " + str1.equals(str3));	// �r�ꤺ�e���
		System.out.println("str2 = str3 " + str2.equals(str3));	// �r�ꤺ�e���
	}
}

