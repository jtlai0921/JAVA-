public class ch12_20 {
	public static void main(String[] args) {
		char[] ch1 = {'��', '��', '��', '��', '�j', '��'};
		String str1 = new String();				// �إߪŦr��
		String str2 = new String(ch1);			// �إߤ��夺�e�r��
		String str3 = new String(str2);			// �إ�str2�r��ƥ�
		str1 = str2;							// �ۦP�ѷ�
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str1 = str2 " + str1.equals(str2));	// �r�ꤺ�e���
		System.out.println("str3 = str2 " + str3.equals(str2));	// �r�ꤺ�e���	
	}
}

