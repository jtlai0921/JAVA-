interface Dog {							// �w�qDog����
	default void running() {			// Default running��k
		System.out.println("���b�]");	
	}
}
interface Cat {							// �w�qCat����
	default void running() {			// Default running��k
		System.out.println("�ߦb�]");
	}
}
class Pet implements Dog, Cat {			// �w�qPet���O
	public void running() {				// ���s�w�qrunning��k
		System.out.println("�ʪ��b�]");
	}
}
public class ch17_15 {
	public static void main(String[] args) {
		Pet obj = new Pet();			// �إ�obj����
		obj.running();	
	}
}

