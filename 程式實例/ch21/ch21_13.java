class Demo {
	public void printDemo(int n) {
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
	Demo  PD;
	JobThread1(Demo pd) {					// �غc��k
		this.PD = pd;
	}  
	public void run() {						// �w�qrun��k
		PD.printDemo(10);					// �C�L���G
	}
}
class JobThread2 extends Thread {			// �~��Thread���O
	Demo  PD;
	JobThread2(Demo pd) {					// �غc��k
		this.PD = pd;
	}  
	public void run() {						// �w�qrun��k
		PD.printDemo(100);					// �C�L���G
	}
}
public class ch21_13 {
	public static void main(String args[]) {
		Demo obj = new Demo();
		JobThread1 t1 = new JobThread1(obj);
		JobThread2 t2 = new JobThread2(obj);
		t1.start();
		t2.start();
	}
}



