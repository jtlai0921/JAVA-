class XDaemon extends Thread {							// �~��Thread���O
	public void run() {									// �w�qrun��k
		if (Thread.currentThread().isDaemon()) {
			System.out.println(" Daemon Starting ... ");
			try {
				sleep(5000);							// ������ίv5��
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}							// ��
			System.out.println(" Daemon Exiting ... ");
		}
		else {
			System.out.println(" non-Daemon Starting ... ");
			System.out.println(" non-Daemon Exiting  ... ");
		}			
	}
}
public class ch21_12 {	
    public static void main(String args[]){
		XDaemon d = new XDaemon();						// ���������d
		XDaemon nd = new XDaemon();						// ���������nd
		d.setDaemon(false);								// �]���DDaemon�����
		d.start();
		nd.start();
	}
}

