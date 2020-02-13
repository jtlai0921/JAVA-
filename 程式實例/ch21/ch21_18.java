public class ch21_18 {
	public static void main(String args[]) {
		String str1 = "Account";			// �귽1
		String str2 = "Pwdword";			// �귽2
		Thread t1 = new Thread() {			// �Q�������Account, Pwdword		
			public void run() {				// �w�qrun��k
				synchronized(str1) {
					System.out.println("�����1: ���Account");
					try {
						Thread.sleep(300);		// �ίv0.3��
					}
					catch(Exception e) {
						System.out.println(e);
					}
					synchronized(str2) {
						System.out.println("�����1: ���Pwdword");
					}
				}
			}
		};
		Thread t2 = new Thread() {			// �Q�������Pwdword, Account		
			public void run() {				// �w�qrun��k
				synchronized(str2) {
					System.out.println("�����2: ���Pwdword");
					try {
						Thread.sleep(300);		// �ίv0.3��
					}
					catch(Exception e) {
						System.out.println(e);
					}
					synchronized(str1) {
						System.out.println("�����2: ���Account");
					}
				}
			}
		}; 
		t1.start();
		t2.start();
	}
}



