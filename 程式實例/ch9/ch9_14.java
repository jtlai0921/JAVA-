class TaipeiBank {
	private String name;					// �}��̩m�W
	private int balance;					// �s�ڪ��B
	public TaipeiBank(String name) {
		this.name = name;					// �]�w�}��̩m�W
		this.balance = 0;					// �]�w�}����B�O0
	}
	public void saveMoney(int money) {		// �s��
		this.balance += money;
	}
	public void withdrawMoney(int money) {	// ����
		this.balance -= money;
	}
	public void get_balance() {				// �C�X�}��̪��s�ھl�B
		System.out.println(name + " �ثe�s�ھl�B " + balance);
	}
}
public class ch9_14 {
	public static void main(String[] args) {
		TaipeiBank A = new TaipeiBank("Hung");
		A.get_balance();
		A.saveMoney(1000);					// �s��1000
		A.get_balance();
		A.withdrawMoney(500);				// ����500
		A.get_balance();
	}
}

