interface Fly {							// �w�q����
	void flying();						// ��Hflying��k
}
class Bird implements Fly {				// �w�qBird���O��@Fly����
	public void flying() {				// ��@flying��k
		System.out.println("���b����");	
	}
}
class Airplane implements Fly {			// �w�qAirplane���O��@Fly����
	public void flying() {				// ��@flying��k
		System.out.println("�����b����");	
	}
}
public class ch17_1 {
	public static void main(String[] args) {
		Fly bird = new Bird();			// Upcasting
		bird.flying();
		Fly airplane = new Airplane();	// Upcasting
		airplane.flying();
	}
}

