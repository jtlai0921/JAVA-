public class ch12_15 {
	public static void main(String[] args) {
		String str = "����L�Q�O���L�P�p�s�k���G��";
		System.out.println("����2���r�� = " + str.charAt(2));
		System.out.println("����5�s�r�� = " + str.substring(5));
		System.out.println("����5-11�s�r�� = " + str.substring(5, 11));
		char[] ch = str.toCharArray();		// �N�r�ꪫ��str�ন�r���}�Cch
		System.out.println(ch);				// �C�L�r���}�C���e
		System.out.println("�C�L�����r���}�C���e = " + ch[0] + ch[1] + ch[2] + ch[3]);
	}
}

