class HorseRacing implements Runnable {				// ��@Runnable����
	private String name;
	HorseRacing(String name) {						// �غc��k
		this.name = name;							// �]�w�W��
	}
	public void run() {								// �w�qrun��k
		for (int i = 1; i <= 1000; i++) 
			System.out.println(name + " ���b�]�� " + i + " ��  ... ");
	}
}
public class ch21_7 {	
    public static void main(String args[]){
		HorseRacing hr1 = new HorseRacing("Horse1");// �إ�HorsRacing����
		HorseRacing hr2 = new HorseRacing("Horse2");// �إ�HorsRacing����
		Thread t1 = new Thread(hr1);				// �إ�t1�����
		Thread t2 = new Thread(hr2);				// �إ�t2�����
		t1.start();
		t2.start(); 
	}
}

