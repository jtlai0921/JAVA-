class A implements Runnable {				// ��@A����
	public void run() {						// �w�qrun��k
		System.out.println("A is running");
	}
}
public class ch21_6 {	
    public static void main(String args[]){
		A a = new A();						// �إ�a����
		Thread t = new Thread(a);			// �إ�t�����
		t.start(); 
	}
}

