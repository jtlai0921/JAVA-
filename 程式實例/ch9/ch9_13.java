class TaipeiBank {
	private String name;					// �}��̩m�W
	private int balance;					// �s�ڪ��B
	TaipeiBank(String name) {
		this.name = name;					// �]�w�}��̩m�W
		this.balance = 0;					// �]�w�}����B�O0
	}
	void get_balance() {					// �C�X�}��̪��s�ھl�B
		System.out.println(name + " �ثe�s�ھl�B " + balance);
	}
}
public class ch9_13 {
	public static void main(String[] args) {
		TaipeiBank A = new TaipeiBank("Hung");
		A.get_balance();
		A.balance = 1000;					// �]�w�s�ڪ��B
		A.get_balance();
	}
}

