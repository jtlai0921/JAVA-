interface Animal {								// �w�qAnimal����
	void who();									// �w�q��H��kwho
	default void running() {					// Default running��k
		System.out.println("�ʪ��b�]");	
	}
}
interface Dog extends Animal {					// �w�qDog����
	default void running() {					// Default running��k
		System.out.println("���b�]");
	}
}
class Pet implements Dog {						// �w�qPet���O
	public void who() {							// ��@who��k
		System.out.println("�ڬO�ʪ�");
	}
}
public class ch17_19 {
	public static void main(String[] args) {
		Pet obj = new Pet();					// �إ�obj����
		obj.running();							// �l�����u��
		obj.who();								// �I�swho
	}
}

