class Animal {
	public void moving() {
		System.out.println("�ʪ��i�H����");
	}
}
class Cat extends Animal {
	public void moving() {
		super.moving();				// �I�s�����O��moving()��k
		System.out.println("�ߥi�H�����M��");
	}
}
public class ch14_21 {
	public static void main(String[] args) {
		Cat c = new Cat();			// �l���O�ߪ���
		c.moving();					// �I�s�l���Omoving()��k
	}
}

