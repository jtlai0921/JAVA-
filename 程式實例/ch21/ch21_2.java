class MultiThread extends Thread {
	public void run() {							// ���s�w�qrun��k
		System.out.println("Thread�B�椤 ...");
	}
}
public class ch21_2 {	
    public static void main(String args[]){
		MultiThread t = new MultiThread();		// �إߥثe���������
		t.start();
		System.out.println("�C�X�w�]��������W��: " + t.getName()); 
	}
}

