abstract class Car {
	abstract void run();						// ��H��k		
	void refuel() {								// ���鴶�q��k
		System.out.println("�T���[�o");
	}
}
class Bmw extends Car {							// �w�qcar�l���OBmw
}
public class ch16_8 {
	public static void main(String[] args) {
		Bmw bmw = new Bmw();					// �w�qBmw���O����bmw
		bmw.refuel();
	}
}

