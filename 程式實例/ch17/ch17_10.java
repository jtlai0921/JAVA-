interface Bird {						// �w�qBird����
	void birdFly();						// ��HbirdFly��k
}
interface Airplane {					// �w�qAirplane����
	void airplaneFly(); 				// ��HairplaneFly��k
}
class Fly implements Bird, Airplane {	// �w�qFly���O��@Bird�MAirplane
	public void birdFly() {				// ��@birdFly��k
		System.out.println("���ίͻH��");	
	}
	public void airplaneFly() {			// ��@airplaneFly��k
		System.out.println("�����Τ�����");	
	}
}
public class ch17_10 {
	public static void main(String[] args) {
		Fly obj = new Fly();			// �إ�obj����
		obj.birdFly();
		obj.airplaneFly();
	}
}

