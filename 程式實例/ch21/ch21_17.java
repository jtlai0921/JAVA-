class Demo {
	synchronized static void printDemo(int n) {	// �P�B�R�A��k
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
class JobThread1 extends Thread {			// �~��Thread���O
	public void run() {						// �w�qrun��k
		Demo.printDemo(10);					// �C�L���G
	}
}
class JobThread2 extends Thread {			// �~��Thread���O
	public void run() {						// �w�qrun��k
		Demo.printDemo(100);				// �C�L���G
	}
}
class JobThread3 extends Thread {			// �~��Thread���O
	public void run() {						// �w�qrun��k
		Demo.printDemo(1000);				// �C�L���G
	}
}
public class ch21_17 {
	public static void main(String args[]) {
		JobThread1 t1 = new JobThread1();
		JobThread2 t2 = new JobThread2();
		JobThread3 t3 = new JobThread3();
		t1.start();
		t2.start();
		t3.start();
	}
}



