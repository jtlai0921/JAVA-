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
		this.name = name;			// �I�s�����O�غc��k
	}
	public void barking() {			// Dog���O�ۦ�����kbarking
		System.out.println(name + "���b�s");	// �i�H�~��name�F
	}
}
class Bird extends Animal {
	Bird(String name) {				// Bird�غc��k
		this.name = name;			// �I�s�����O�غc��k
	}
	public void flying() {			// Bird���O�ۦ�����kflying
		System.out.println(name + "���b��");	// �i�H�~��name�F
	}
}
public class ch14_10 {
	public static void main(String[] args) {
		Dog dog = new Dog("Haly");		
		dog.eat();					// dog�~��Animal��keat()
		dog.sleep();				// dog�~��Animal��ksleep()
		dog.barking();				// Dog���O�ۦ�����k
		Bird bird = new Bird("Cici");		
		bird.eat();					// bird�~��Animal��keat()
		bird.sleep();				// bird�~��Animal��ksleep()
		bird.flying();				// bird���O�ۦ�����k
	}
}

