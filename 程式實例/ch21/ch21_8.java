class HorseRacing extends Thread {					// �~��Thread���O
	HorseRacing(String name) {						// �غc��k
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
			System.out.println(getName() + " ���b�]�� " + i + " ��  ... ");
		}
	}
}
public class ch21_8 {	
    public static void main(String args[]){
		HorseRacing t1 = new HorseRacing("Horse1");	// �إ߰��������
		HorseRacing t2 = new HorseRacing("Horse2");	// �إ߰��������
		t1.start();
		t2.start(); 
	}
}

