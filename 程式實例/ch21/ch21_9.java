class Xjoin extends Thread {						// �~��Thread���O
	Xjoin(String name) {							// �غc��k
		super(name);								// �]�w�W��
	}
	public void run() {								// �w�qrun��k
		for (int i = 1; i <= 5; i++) {
			try {
				sleep(500);							// ������ίv0.5��
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(getName() + " is running : " + i);
		}
	}
}
public class ch21_9 {	
    public static void main(String args[]){
		Xjoin job1 = new Xjoin("Job1");				// �إ߰��������job1
		Xjoin job2 = new Xjoin("Job2");				// �إ߰��������job2
		Xjoin job3 = new Xjoin("Job3");				// �إ߰��������job3
		job1.start();
		try {										
			job1.join();							// Job1�u������쵲��
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		job2.start();
		job3.start();
	}
}

