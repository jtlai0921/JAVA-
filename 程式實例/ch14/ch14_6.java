class Animal {
	public String name;				// �w�q�ʪ��W�r
	public void eat() {				// Animal��keat
		System.out.println(name + "���b�Y����");
	}
	public void sleep() {			// Animal��ksleep
		System.out.println(name + "���b��ı");
	}
}
class Dog extends Animal {
	Dog(String name) {				// Dog�غc��k
		this.name = name;			// �غc�����Oname�ݩ�
	}
	public void barking() {			// Dog���O�ۦ�����kbarking
		System.out.println(name + "���b�s");
	}
}
public class ch14_6 {
	public static void main(String[] args) {
		Dog dog = new Dog("Haly");		
		dog.eat();					// dog�~��Animal��keat()
		dog.sleep();				// dog�~��Animal��ksleep()
		dog.barking();				// Dog���O�ۦ�����k
	}
}

