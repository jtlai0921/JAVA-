class Animal {
	public void moving() {				// 	�����O��moving()��k	
		System.out.println("�ʪ��i�H����");
	}
}
class Cat extends Animal {			
	public void moving(String msg) {	// �h���w�q�����O��moving()��k	
		System.out.println(msg);
	}
}
public class ch14_26 {
	public static void main(String[] args) {
		Cat c = new Cat();				// �l���O�ߪ���
		c.moving();						// �I�s�����Omoving()��k
		c.moving("�ߥi�H�����M��");		// �I�s�l���Omoving()��k
	}
}

