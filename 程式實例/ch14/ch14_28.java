class Bank {
	public double RateInterest() {		// 	Bank���O���Q�v()��k	
		return 0;
	}
}
class FirstBank extends Bank {			
	public double RateInterest() {		// ���s�w�q�Q�v()��k	
		return 1.05;
	}
}
class TaishinBank extends Bank {			
	public double RateInterest() {		// ���s�w�q�Q�v()��k	
		return 1.1;
	}
}
public class ch14_28 {
	public static void main(String[] args) {
		Bank A = new Bank();
		System.out.println("Bank�Q�v : " + A.RateInterest());
		A = new FirstBank();
		System.out.println("First Bank�Q�v : " + A.RateInterest());
		A = new TaishinBank();
		System.out.println("Taishin Bank�Q�v : " + A.RateInterest());
	}
}

