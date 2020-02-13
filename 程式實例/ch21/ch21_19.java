class Bank{  
	int balance = 10000;  					// �s�ھl�B 
	synchronized void withdraw(int amount){ // �Ѽ�amount�O���ڪ��B 
		System.out.println("����");  
		while (balance < amount) {  
			System.out.println("���B����, �L�k����, ���ݦs��");  
			try{
				wait();						// ����
			}
			catch(Exception e){
				System.out.println(e);
			}
		}  
		balance -= amount;  				// �p�ⴣ�ګ�l�B
		System.out.println("���ڧ���");  
	}   
	synchronized void deposit(int amount){  
		System.out.println("�s��");  
		balance += amount;  				// �[�`�s�ھl�B
		System.out.println("�s�ڧ���");  
		notify();  							// �q��
	}  
}    
public class ch21_19 {  
	public static void main(String args[]){  
		Bank bank = new Bank();  
		Thread t1 = new Thread(){  			// ���ڪ���
			public void run(){
				bank.withdraw(15000);   	// ����15000
			}  
		};
		t1.start();  	
		Thread t2 = new Thread(){  			// �s�ڪ���
			public void run(){
				bank.deposit(10000);		// �s��10000
			}  
		};
		t2.start();   
	}
}  



