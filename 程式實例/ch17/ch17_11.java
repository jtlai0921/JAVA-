interface Bird {						// �w�qBird����
	void birdFly();						// ��HbirdFly��k
}
interface Airplane {					// �w�qAirplane����
	void airplaneFly(); 				// ��HairplaneFly��k
}
interface Fly extends Bird, Airplane {	// �w�qFly�����~��Bird�MAirplane
	void pediaFly( );					// ��HpediaFly��k
}
class InfoFly implements Fly {
	public void birdFly() {				// ��@birdFly��k
		System.out.println("���ίͻH��");	
	}
	public void airplaneFly() {			// ��@airplaneFly��k
		System.out.println("�����Τ�����");	
	}
	public void pediaFly() {			// ��@pediaFly��k
		System.out.println("����ʬ�");
	}
}
public class ch17_11 {
	public static void main(String[] args) {
		InfoFly obj = new InfoFly();	// �إ�obj����
		obj.birdFly();
		obj.airplaneFly();
		obj.pediaFly();
	}
}

