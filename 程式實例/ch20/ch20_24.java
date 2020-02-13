class NotEnoughException extends Exception {	// �ۦ�w�q���`
	private int shortAmount;					// ���`�ɩҤ���B
	public NotEnoughException(int shortAmount) {
		this.shortAmount = shortAmount;			// �]�w�Ҥ�l�B
	} 
	public double getShortAmount() {			// ���o�Ҥ�l�B
		return shortAmount;						// �Ǧ^�Ҥ�l�B
	}
}
class MyBank {						 
	private int balance;						// �s�ھl�B
	public void deposit(int cashin) {			// �s��
		balance += cashin;
	}
	public void withdraw(int cashout) throws NotEnoughException { // ����
		if(cashout <= balance) {				// �ˬd���ڬO�_�p��s�ھl�B
			balance -= cashout;					// true�b�᥿�`����
		}
		else {									// false
			int shortA = cashout - balance;		// �p��u�֪��B
			throw new NotEnoughException(shortA);	// �ߥX���`�N�u�֪��B�����`���O
		}
	}
	public double getBalance() {				// �Ǧ^�l�B
		return balance;
	}
}
public class ch20_24 {
	public static void main(String [] args) {
		MyBank obj = new MyBank();
		System.out.println("�s��1000�� ... ");
		obj.deposit(1000);
		try {
			System.out.println("����500�� ... ");
			obj.withdraw(500);
			System.out.println("����600�� ... ");
			obj.withdraw(600);
		} 
		catch(NotEnoughException e) {
			System.out.println("�s�ڪ��B���� : " + e.getShortAmount());
			e.printStackTrace();
		}
    }
}
