class HorseRacing extends Thread {					// �~��Thread���O
	private String name;
	HorseRacing(String name) {						// �غc��k
		super(name);								// �]�w�W��
	}
	public void run() {								// �w�qrun��k
		for (int i = 1; i <= 1000; i++) 
			System.out.println(getName() + " ���b�]�� " + i + " ��  ... ");
	}
}
public class ch21_5 {	
    public static void main(String args[]){
		HorseRacing t1 = new HorseRacing("Horse1");	// �إ߰��������
		HorseRacing t2 = new HorseRacing("Horse2");	// �إ߰��������
		t1.start();
		t2.start(); 
	}
}

