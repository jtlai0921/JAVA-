interface Dog {							// �w�qDog����
	int age = 5;
	void running();						// ��Hrunning��k
}
interface Cat {							// �w�qCat����
	int age = 6;
	void running(); 					// ��Hrunning��k
}
class Pet implements Dog, Cat {			// ���OPet
	public void running() {				// ��@running��k
		System.out.println("�ڪ��d���O " + age + " �����b�]");	// ���~
	}
}
public class ch17_13 {
	public static void main(String[] args) {
		Pet obj = new Pet();			// �إ�obj����
		obj.running();
	}
}

