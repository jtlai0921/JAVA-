abstract class Car {
	abstract void run();						// ��H��k		
	void refuel() {								// ���鴶�q��k
		System.out.println("�T���[�o");
	}
}
abstract class Bmw extends Car {				// Bmw�l���O�w�q����H���O
}
class Type750 extends Bmw {						// �~��Bmw���O
	public void run() {							// ���s�w�qrun��k
		System.out.println("�w���r�p�� ...");
	}
}
public class ch16_9 {
	public static void main(String[] args) {
		Type750 bmw = new Type750();			// �w�qType750���O����bmw
		bmw.refuel();
		bmw.run();
	}
}

