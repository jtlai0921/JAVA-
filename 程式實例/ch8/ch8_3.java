class Dog {
	String name;		// �W�r
	String color;		// �C��
	int age;			// �~��
	void barking( ) {	// ��kbarking()
		System.out.println("���b�s");
	}
	void sleeping( ) {	// ��ksleeping()
		System.out.println("���b��ı");
	}
}

public class ch8_3 {
	public static void main(String[] args) {
		Dog myDog = new Dog();		// �ŧi�P�إ�myDog����
		Dog TomDog = new Dog(); 	// �ŧi�P�إ�TomDog����
		
		myDog.name = "Lily";		// �]�wmyDog��name�ݩ�
		System.out.print("�ڪ����W�r�O " + myDog.name + " ");
		myDog.barking();			// �I�s��kbarking()
		
		TomDog.name = "Hali"; 		// �]�wTomDog��name�ݩ�
		System.out.print("Tom�����W�r�O " + TomDog.name + " ");
		myDog.sleeping();			// �I�s��ksleeping()
	}
}

