class Demo {
	public synchronized void printDemo(int n) {
        for(int i = 1; i <= 5; i++) {
            System.out.println("��X : "  + (i * n) );
			try {
				Thread.sleep(500);			// �ίv0.5��
			}
			catch(Exception e) {
				System.out.println(e);
			}
        }
	}
}
public class ch21_15_1 {
	public static void main(String args[]) {
		Demo obj = new Demo();  
		new Thread() {
			public void run() {				// �w�qrun��k
				obj.printDemo(10);			// �C�L���G
			};
		}.start();
		new Thread() {
			public void run() {				// �w�qrun��k
				obj.printDemo(100);			// �C�L���G
			};
		}.start();  
	}
}



