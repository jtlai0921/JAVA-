class Animal {
	public void moving() {			// �s���v���Opublic
		System.out.println("�ʪ��i�H����");
	}
}
class Cat extends Animal {
	protected void moving() {		// �s���v�����Y��protected
		System.out.println("�ߥi�H�����M��");
	}
}
public class ch14_23 {
	public static void main(String[] args) {
		Animal a = new Animal();	// �����O�ʪ�����
		Cat c = new Cat();			// �l���O�ߪ���
		a.moving();					// �I�s�����Omoving()��k
		c.moving();					// �I�s�l���Omoving()��k
	}
}

