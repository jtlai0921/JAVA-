public class ch12_11 {
	public static void main(String[] args) {
		char[] ch1 = {'��', '��', '��', '��', '�j', '��'};
		char[] ch2 = {'M', 'I', 'N', 'G', '-', 'C', 'H', 'I'};
		String str1 = new String(ch1);			// �إߤ��夺�e�r��
		String str2 = new String(ch2);			// �إ߭^�夺�e�r��
		String str3 = new String();				// �إߪŦr��
		System.out.println("str1�r�ꤺ�e = " + str1);
		System.out.println("str1�r����� = " + str1.length());
		System.out.println("str1�O�Ŧr�� = " + str1.isEmpty());
		System.out.println("str2�r�ꤺ�e = " + str2);
		System.out.println("str2�r����� = " + str2.length());
		System.out.println("str2�O�Ŧr�� = " + str2.isEmpty());
		System.out.println("str3�r�ꤺ�e = " + str3);
		System.out.println("str3�r����� = " + str3.length());
		System.out.println("str3�O�Ŧr�� = " + str3.isEmpty());
	}
}

