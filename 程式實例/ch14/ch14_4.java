class Animal {
	public void eat( ) {			// Animal��keat
		System.out.println("���b�Y����");
	}
	public void sleep( ) {			// Animal��ksleep
		System.out.println("���b��ı");
	}
}
class Dog extends Animal {
	public void barking() {			// Dog���O�ۦ�����kbarking
		System.out.println("���b�s");
	}
}
public class ch14_4 {
	public static void main(String[] args) {
		Dog dog = new Dog();		
		dog.eat();					// dog�~��Animal��keat()
		dog.sleep();				// dog�~��Animal��ksleep()
		dog.barking();				// Dog���O�ۦ�����k
	}
}

