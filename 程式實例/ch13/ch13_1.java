public class ch13_1 {
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
	public static void main(String[] args) {		
		System.out.println("I love Java :�O�x�W������X" + taiwanPhone("I love Java"));
		System.out.println("0952-909-090:�O�x�W������X" + taiwanPhone("0952-909-090"));
		System.out.println("1111-1111111:�O�x�W������X" + taiwanPhone("111-11111111"));
	}
}

