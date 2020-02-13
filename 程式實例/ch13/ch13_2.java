public class ch13_2 {
	public static boolean taiwanPhone(String str) {
		if (str.length() != 12)			// �p�G���פ��O12
			return false;				// �Ǧ^�D������X�榡
		for ( int i = 0; i <= 3; i++ )	// �p�G���ޫe4�Ӧr���X�{�D�Ʀr�r��
			if (Character.isDigit(str.charAt(i)) == false)
				return false;			// �Ǧ^�D������X�榡
		if (str.charAt(4) != '-')		// �p�G���O'-'�r��
			return false;				// �Ǧ^�D������X�榡
		for ( int i = 5; i <= 7; i++ )	// �p�G����5-7�r���X�{�D�Ʀr�r��
			if (Character.isDigit(str.charAt(i)) == false)
				return false;			// �Ǧ^�D������X�榡
		if (str.charAt(8) != '-')		// �p�G���O'-'�r��
			return false;				// �Ǧ^�D������X�榡
		for ( int i = 9; i <= 11; i++ )	// �p�G����9-11�r���X�{�D�Ʀr�r��
			if (Character.isDigit(str.charAt(i)) == false)
				return false;			// �Ǧ^�D������X�榡	
		return true;					// �q�L�H�W����Ǧ^true
	}
	public static void parseString(String str) {
		boolean notFoundSignal = true;					// ���O�S���q�ܸ��X��true
		for ( int i = 0; i < (str.length()-11); i++ ) {	// �ΰj��v�B���12�Ӧr��������
			String msg = new String();					// �إߪŦr��
			msg = str.substring(i, i+12);				// ���o�r��
			if (taiwanPhone(msg)) {
				System.out.println("�q�ܸ��X�O : " + msg);
				notFoundSignal = false;
			}	
		}
		if ( notFoundSignal )			// �p�G�S�����q�ܸ��X�h�C�L
			System.out.println(str + " �r�ꤣ�t�q�ܸ��X");		
	}
	public static void main(String[] args) {
		String msg1 = "Please call my secretary using 0930-919-919 or 0952-001-001";
		String msg2 = "�Щ���17:30�M�ڤ@�_�ѥ[���Ӭ�j�Юv�`���\";
		String msg3 = "�Щ���17:30�M�ڤ@�_�ѥ[���Ӭ�j�Юv�`���\, �i��0933-080-080�p����";
		parseString(msg1);
		parseString(msg2);
		parseString(msg3);
	}
}

