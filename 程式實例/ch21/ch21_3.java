class MultiThread extends Thread {
	MultiThread(String name) {						// �غc��k
		super(name);								// �]�w������W��
	}
	public void run() {								// ���s�w�qrun��k
		System.out.println("Thread�B�椤 ...");
	}
}
public class ch21_3 {	
    public static void main(String args[]){
		MultiThread t = new MultiThread("Horse");	// �إߥثe���������
		t.start();
		System.out.println("�C�X�w�]��������W��: " + t.getName()); 
	}
}

