class TaipeiBank {
	int balance;							// �s�ڪ��B
	TaipeiBank() {							// �۫ثغc��k	
		balance = 0;						// �s�ھl�B��ȬO0
	}
	void printBalance() {					// �C�L�s�ھl�B
		System.out.println("�s�ھl�B : " + balance);
	}
}

public class ch9_3 {
	public static void main(String[] args) {
		TaipeiBank A = new TaipeiBank();	// ���O����
		A.printBalance();					// �C�L�s�ھl�B
	}
}
 
