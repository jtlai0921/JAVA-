public class ch20_18 {	
	public static void pwdCheck(String pwdStr) {
		if (pwdStr.length()>=5 && pwdStr.length()<=8) {			// �K�X���צb5-8����
			System.out.println("�K�X���e���\ : " + pwdStr);		// true,�C�X���T
		}
		else {													// false
			System.out.println("�K�X���e���� : " + pwdStr);		// �C�X����
			throw new StringIndexOutOfBoundsException("�K�X���פ��ųW�w");	// �ߥX���`
		}
	}
    public static void main(String args[]){
		String[] pwd = {"123456", "123456789", "1234567" };		// �K�X�r��}�C
		for ( int i = 0; i < pwd.length; i++ ) {				// �ˬd�Ҧ�����
			try {												// try�϶�
				pwdCheck(pwd[i]);
			}
			catch(StringIndexOutOfBoundsException e) {			// catch�϶�
				System.out.println("Error! " + e);				// ���`�B�z�{��
				e.printStackTrace();							// �^�����
			}
		}
		System.out.println("���ձK�X�r��"); 					// �{�������C�L���ֵ�
	}
}

