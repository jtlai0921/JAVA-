class TaipeiBank {
	int account;										// �b��
	int balance;										// �s�ڪ��B
	void printInfo( ) {									// ��kprintInfo()
		System.out.printf("�b�� : %d, �l�B : %d\n", account, balance);		
	}
}

public class ch8_4 {
	public static void main(String[] args) {
		TaipeiBank[] shilin = new TaipeiBank[5];		// ���O����}�C
		
		for ( int i = 0; i < shilin.length; i++ ) {		// �إ߱b���T��
			shilin[i] = new TaipeiBank();				// �إߪ���
			shilin[i].account = 10000001 + i;			// �]�w�b��
			shilin[i].balance = 0;						// �̪�Ʀs�ڬO0
		}
		for ( TaipeiBank sh:shilin )					// �C�L�b���T��
			sh.printInfo();
	}
}

