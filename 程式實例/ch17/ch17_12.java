interface Bird {						// �w�qBird����
	void flying();						// ��Hflying��k
}
interface Airplane {					// �w�qAirplane����
	void flying(); 						// ��Hflying��k
}
class InfoFly implements Bird, Airplane {
	public void flying() {				// ��@flying��k
		System.out.println("���b����");	
	}
}
public class ch17_12 {
	public static void main(String[] args) {
		InfoFly obj = new InfoFly();	// �إ�obj����
		obj.flying();
	}
}

