class Father {
	protected int x = 50;
}
class Child extends Father {
	protected int x = 100;
}
public class ch14_13 {
	public static void main(String[] args) {
		Father father = new Father();	// �إߤ����O����
		Child child = new Child();		// �إߤl���O����
		System.out.println("�C�LFather���O x : " + father.x);
		System.out.println("�C�LChild ���O x : " + child.x);
	}
}

