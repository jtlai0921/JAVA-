class TaipeiBank {
	int account;									// �b��
	int balance;									// �s�ڪ��B
	Boolean saveMoney(int save) {					// �s��
		if (save > 0) {								// �s�ڪ��B�j��0
			balance += save;						// ����s��
			return true;							// �Ǧ^true
		}
		else 
			return false;							// �_�h�Ǧ^false	
	}		
	void printInfo( ) {								// �C�L�b���P�l�B
		System.out.printf("�b�� : %d, �l�B : %d\n", account, balance);		
	}
}

public class ch8_10 {
	public static void main(String[] args) {
		TaipeiBank A = new TaipeiBank();			// ���O����
		A.account = 10000001;						// �]�w�b��
		A.balance = 0;								// �̪�Ʀs�ڬO0
		
		A.printInfo();								// �s�ګe
		System.out.println("�s��" + 
			((A.saveMoney(100)) ? "���\":"����"));	// �s�ڪ��B100
		A.printInfo();								// �s��100��
		System.out.println("�s��" + 
			((A.saveMoney(-100)) ? "���\":"����"));	// �s�ڪ��B-100
		A.printInfo();								// �s��-100��
	}
}

