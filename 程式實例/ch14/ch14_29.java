class Bank {
	public void demoInterest() {		// 	�C�L�Q�v
		System.out.println("Bank�Q�v : " + 0);
	}
}
class FirstBank extends Bank {			
	public void demoInterest() {		// �C�L�Q�v	
		System.out.println("Bank�Q�v : " + 1.05);
	}
}
public class ch14_29 {
	public static void main(String[] args) {
		Bank A = new Bank();
		A.demoInterest();
		FirstBank B = new FirstBank();
		B.demoInterest();	
		A = B;							// ���Ѧ�
		A.demoInterest();
	}
}

