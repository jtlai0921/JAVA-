class Animal {
	private String name;			// �w�q�ʪ��W�r
	Animal(String name) {			// �غc��k�]�w�W�r
		this.name = name;
	}
	public void eat() {				// Animal��keat
		System.out.println(name + "���b�Y����");
	}
	public void sleep() {			// Animal��ksleep
		System.out.println(name + "���b��ı");
	}
}
class Dog extends Animal {
	Dog(String name) {				// Dog�غc��k
		super(name);				// �I�s�����O�غc��k
	}
	public void barking() {			// Dog���O�ۦ�����kbarking
		System.out.println("���b�s");
	}
}
public class ch14_7 {
	public static void main(String[] args) {
		Dog dog = new Dog("Haly");		
		dog.eat();					// dog�~��Animal��keat()
		dog.sleep();				// dog�~��Animal��ksleep()
		dog.barking();				// Dog���O�ۦ�����k
	}
}

