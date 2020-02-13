import java.util.Random;
class Factory {
	private int product;			// ���~
	private boolean empty;			// �P�O�w�s
	Factory() {
		this.empty = true;			// �w�s�O�Ū�
	}
	public synchronized void produce(int newProduct) {
		while (!this.empty) {
			try {
				wait();				// ���w�s�Ͳ��ݵ���
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		product = newProduct;		// newProduct�O���~
		System.out.println("�Ͳ� : " + newProduct);
		empty = false;
		notify();					// ���w�s�q���i�H���O		
		try {
			Thread.sleep(500);		// �ίv0.5��
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public synchronized void consume() {
		while (empty) {
			try {
				wait();				// �S���w�s���O�ݵ���
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty = true;
		System.out.println("���O : " + product);
		notify();					// �S���w�s�q���i�H�Ͳ�	
		try {
			Thread.sleep(500);		// �ίv0.5��
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Consumer extends Thread {		// ���O���O
	private Factory factory;		// Factory���O�O�����ܼ�
	public Consumer(Factory factory) {
		this.factory = factory;
	}
	public void run() {
		int data;
		while (true) {				// �L���j����O
			factory.consume();
		}
	}
}
class Producer extends Thread {		// �Ͳ����O
  private Factory factory;			// Factory���O�O�����ܼ�
  public Producer(Factory factory) {
    this.factory = factory;
  }
  public void run() {
    Random rand = new Random();
    while (true) {					// �L���j��Ͳ�
      int n = rand.nextInt(1000);	
      factory.produce(n);
    }
  }
}
public class ch21_20 {
  public static void main(String[] args) {
    Factory factory = new Factory();
    Producer p = new Producer(factory);
    Consumer c = new Consumer(factory);
	System.out.println("�P�ɫ�Ctrl+C�i���_�{��");
    p.start();
    c.start();
  }
}






