public class ch12_7 {
	public static void main(String[] args) {
		char[] ch1 = {'��', '��', '��', '��', '�j', '��'};
		char[] ch2 = {'M', 'I', 'N', 'G', '-', 'C', 'H', 'I'};
		String str1 = new String();				// �إߪŦr��
		String str2 = new String(ch1);			// �إߤ��夺�e�r��
		String str3 = new String(ch2);			// �إ߭^�夺�e�r��
		String str4 = new String(ch1, 2, 4);	// �إ߯���2�}�l������r����׬O4
		String str5 = new String(ch2, 2, 4);	// �إ߯���2�}�l���^��r����׬O4
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str4 = " + str4);
		System.out.println("str5 = " + str5);
	}
}

