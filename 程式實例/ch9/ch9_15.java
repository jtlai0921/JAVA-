class TaipeiBank {
	private String name;					// �}��̩m�W
	private int balance;					// �s�ڪ��B
	private int rate = 30;					// �ײv
	private double service_charge = 0.01;	// ����O�v
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
	public double usa_to_taiwan(int usaD) {	// ���׭p��
		if ( this.balance >= 10000 )		// �p�G�s�ڤj��ε���10000��
			this.service_charge = 0.008;	// ����O�v0.008
		return cal_rate(usaD);
	}
	private double cal_rate(int usaD) {		// �u��p�⴫�ת��B
		double result;
		result = usaD * rate * (1 - service_charge);	// ���׵��G
		return result;						// �^�Ǵ��׵��G
	}
	public void get_balance() {				// �C�X�}��̪��s�ھl�B
		System.out.println(name + " �ثe�s�ھl�B " + balance);
	}
}
public class ch9_15 {
	public static void main(String[] args) {
		TaipeiBank A = new TaipeiBank("Hung");
		int usdallor = 50;
		A.saveMoney(5000);					// �s��5000
		System.out.println(usdallor + " �����i�H�I�� " + A.usa_to_taiwan(usdallor) 
							+ " �x�� ");
		A.saveMoney(15000);					// �s��15000
		System.out.println(usdallor + " �����i�H�I�� " + A.usa_to_taiwan(usdallor) 
							+ " �x�� ");
	}
}


