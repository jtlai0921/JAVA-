class TaipeiBank {
	int account;									// �b��
	int balance;									// �s�ڪ��B
	void saveMoney(int balance) {					// �s��
		this.balance += balance;
	}		
	void printInfo( ) {								// �C�L�b���P�l�B
		System.out.printf("�b�� : %d, �l�B : %d\n", account, balance);		
	}
}

public class ch8_20 {
	public static void main(String[] args) {
		TaipeiBank A = new TaipeiBank();			// ���O����
		A.account = 10000001;						// �]�w�b��
		A.balance = 0;								// �̪�Ʀs�ڬO0
		
		A.printInfo();								// �s�ګe
		A.saveMoney(100);							// �s�ڪ��B100
		A.printInfo();								// �s�ګ�
	}
}

