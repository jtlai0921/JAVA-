class Animal {
	protected String name;			// �ŧiprotected�s���׹��ũw�q�ʪ��W�r
	public void eat() {				// Animal��keat
		System.out.println(name + "���b�Y����");
	}
	public void sleep() {			// Animal��ksleep
		System.out.println(name + "���b��ı");
	}
}
class Dog extends Animal {
	Dog(String name) {				// Dog�غc��k
		this.name = name;			// �����]�w�ʪ��W�r
	}
	public void barking() {			// Dog���O�ۦ�����kbarking
		System.out.println(name + "���b�s");	// �i�H�~��name�F
	}
}
public class ch14_9 {
	public static void main(String[] args) {
		Dog dog = new Dog("Haly");		
		dog.eat();					// dog�~��Animal��keat()
		dog.sleep();				// dog�~��Animal��ksleep()
		dog.barking();				// Dog���O�ۦ�����k
	}
}

