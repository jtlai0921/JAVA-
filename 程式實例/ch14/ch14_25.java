class Animal {
	public final void moving() {	// �ŧi��final��k
		System.out.println("�ʪ��i�H����");
	}
}
class Cat extends Animal {
	public void moving() {			// ���s�w�qfinal��k���Ϳ��~
		System.out.println("�ߥi�H�����M��");
	}
}
public class ch14_25 {
	public static void main(String[] args) {
		Animal a = new Animal();	// �����O�ʪ�����
		Cat c = new Cat();			// �l���O�ߪ���
		a.moving();					// �I�s�����Omoving()��k
		c.moving();					// �I�s�l���Omoving()��k
	}
}

