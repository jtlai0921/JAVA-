interface Dog {								// �w�qDog����
	void running();							// ��Hrunning��k
}
class Horse {								// �w�qHorse���O
	public void who() {						// �@���kwho
		System.out.println("�ڬO��");
	}
}
class Pet extends Horse implements Dog {	// Pet�~��Horse��@Dog
	public void running() {					// ��@running��k
		System.out.println("�d���b�]");
	}
}
public class ch17_17 {
	public static void main(String[] args) {
		Pet obj = new Pet();				// �إ�obj����
		obj.who();
		obj.running();	
	}
}

