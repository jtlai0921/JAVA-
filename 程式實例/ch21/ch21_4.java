class HorseRacing {									
	private String name;							// ���ǦW���ܼ�
	HorseRacing(String name) {						// �غc��k
		this.name = name;							// �]�w���ǦW��
	}
	public void run() {								// �w�qrun��k
		for (int i = 1; i <= 10; i++)				// �]�w�]10��
			System.out.println(name + " ���b�]�� " + i + " ��  ... ");
	}
}
public class ch21_4 {	
    public static void main(String args[]){
		HorseRacing t1 = new HorseRacing("Horse1");	// �إ�Horse1����
		HorseRacing t2 = new HorseRacing("Horse2");	// �إ�Horse2����
		t1.run();
		t2.run(); 
	}
}

