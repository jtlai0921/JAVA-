interface A {								// �w�qA����
	default void running() {				// Default running��k
		System.out.println("�ڬOA");	
	}
}
interface B extends A {						// �w�qB����
	default void running() {				// Default running��k
		System.out.println("�ڬOB");
	}
}
interface C extends A {						// �w�qC����
	default void running() {				// Default running��k
		System.out.println("�ڬOC");
	}
}
class D implements B, C {					// �w�qD���O
	public void running() {					// ���s�w�qrunning��k
		System.out.println("�ڬOD");
	}
	public void who() {
		B.super.running();
		C.super.running();
	}
}
public class ch17_20 {
	public static void main(String[] args) {
		D obj = new D();					// �إ�obj����
		obj.running();						// ���O�u��
		obj.who();							// �I�swho
	}
}

