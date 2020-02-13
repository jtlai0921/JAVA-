interface Dog {									// �w�qDog����
	void who();									// �w�q��H��kwho
	default void running() {					// Default running��k
		System.out.println("���b�]");	
	}
}
interface Cat {									// �w�qCat����
	void who();									// �w�q��H��kwho
	default void running() {					// Default running��k
		System.out.println("�ߦb�]");
	}
}
class Horse {
	public void running() {
		System.out.println("���b�]");
	}
}
class Pet extends Horse implements Dog, Cat {	// �w�qPet���O
	public void who() {							// ��@who��k
		System.out.println("�ڬO�d��");
		Dog.super.running();					// Dog������running
		Cat.super.running();					// Cat������running
	}
}
public class ch17_18 {
	public static void main(String[] args) {
		Pet obj = new Pet();					// �إ�obj����
		obj.running();							// ���O�u��
		obj.who();								// �I�swho
	}
}

