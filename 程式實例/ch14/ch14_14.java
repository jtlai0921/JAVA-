class Father {
	protected int x = 50;
}
class Child extends Father {
	protected int x = 100;
	public void printInfo(){
		System.out.println("�C�LFather���O x : " + super.x);
		System.out.println("�C�LChild ���O x : " + x);
	}
}
public class ch14_14 {
	public static void main(String[] args) {
		Father father = new Father();	// �إߤ����O����
		Child child = new Child();		// �إߤl���O����
		child.printInfo();
	}
}

